package cn.edu.ldu.watercloud.mapper;

import cn.edu.ldu.watercloud.entity.ChargeDay;
import cn.edu.ldu.watercloud.entity.Daily_charge;
import cn.edu.ldu.watercloud.entity.Monthly_charge;
import cn.edu.ldu.watercloud.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProjectMapper {

    ChargeDay selectByUserAndUseWaterAndProject();

    @Select("SELECT project_name,house_num,water_price,amount_sum,cost_sum from (select project.projname as project_name,COUNT(user.name) as house_num,project.price as water_price,SUM(usewater.amount) as amount_sum,SUM(usewater.amount)*project.price as cost_sum from project,user,usewater where user.id= usewater.userid and usewater.year=#{year} and usewater.month=#{month} and usewater.day=#{day}) as Daily_charge")
    List<Daily_charge> daily_charge(int year, int month, int day);
    @Select("SELECT project_name,house_num,water_price,amount_sum,cost_sum from (select project.projname as project_name,COUNT(user.name) as house_num,project.price as water_price,SUM(usewater.amount) as amount_sum,SUM(usewater.amount)*project.price as cost_sum from project,user,usewater where user.id= usewater.userid and usewater.year=#{year} and usewater.month=#{month} ) as Monthly_charge")
    List<Monthly_charge> monthly_charge(int year, int month);

}
