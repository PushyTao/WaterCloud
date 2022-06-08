package cn.edu.ldu.watercloud.mapper;

import cn.edu.ldu.watercloud.entity.ChargeDay;
import cn.edu.ldu.watercloud.entity.Daily_charge;
import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {

    List<ChargeDay> selectByUserAndUseWaterAndProject();

    @Select("SELECT projectName,households,unitPrice,projectNumDay,projectPriceDay from (select project.projname as projectName,COUNT(user.name) as households,project.price as unitPrice,SUM(usewater.amount) as projectNumDay,SUM(usewater.amount)*project.price as projectPriceDay from project,user,usewater where user.id= usewater.userid and usewater.year=#{year} and usewater.month=#{month} and usewater.day=#{day}) as Daily_charge")
    List<Daily_charge> daily_charge(int year, int month, int day);
    @Select("select project.projname as projectName,       COUNT(*) as households,       project.price as unitPrice,       sum(usewater.amount) as projectNumMonthly,       sum(usewater.amount) * project.price as projectPriceMonthly,       concat(usewater.year,LPAD(usewater.month,2,0)) as time, project.salesman as salesman from project         JOIN user ON project.id=user.projid         JOIN usewater ON user.meterid=usewater.meterid GROUP BY project.id")
    List<ChargeFormMonthly> monthly_charge();

}
