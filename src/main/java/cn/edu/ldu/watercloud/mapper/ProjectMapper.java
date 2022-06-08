package cn.edu.ldu.watercloud.mapper;

import cn.edu.ldu.watercloud.entity.ChargeDay;
import cn.edu.ldu.watercloud.entity.Daily_charge;
import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {

    ChargeDay selectByUserAndUseWaterAndProject();

    @Select("SELECT projectName,households,unitPrice,projectNumDay,projectPriceDay from (select project.projname as projectName,COUNT(user.name) as households,project.price as unitPrice,SUM(usewater.amount) as projectNumDay,SUM(usewater.amount)*project.price as projectPriceDay from project,user,usewater where user.id= usewater.userid and usewater.year=#{year} and usewater.month=#{month} and usewater.day=#{day}) as Daily_charge")
    List<Daily_charge> daily_charge(int year, int month, int day);
    @Select("SELECT projectName,households,unitPrice,projectNumMonthly,projectPriceMonthly from (select project.projname as projectName,COUNT(user.name) as households,project.price as unitPrice,SUM(usewater.amount) as projectNumMonthly,SUM(usewater.amount)*project.price as projectPriceMonthly from project,user,usewater where user.id= usewater.userid and usewater.year=#{year} and usewater.month=#{month}) as Monthly_charge")
    List<ChargeFormMonthly> monthly_charge(int year, int month);

}
