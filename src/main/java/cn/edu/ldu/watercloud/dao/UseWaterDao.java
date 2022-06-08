package cn.edu.ldu.watercloud.dao;

import cn.edu.ldu.watercloud.entity.User;
import cn.edu.ldu.watercloud.entity.result.WaterEveryQuarter;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: WaterCloud
 * @description: 用水报表的dao接口
 * @author: jinjiale
 * @create: 2022-06-07 17:21
 **/
@Mapper
public interface UseWaterDao {
    @Select("select sum(amount) from usewater\n" +
            "where year = #{year} and month = #{month} and userid= #{uid} ;")
    Double FindByYearAndQuarper(int year, int month,int uid);

    @Select("select * from user")
    List<User> getAllUser();

    List<WaterEveryQuarter> queryByQuarter(int quarter);

}
