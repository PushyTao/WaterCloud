package cn.edu.ldu.watercloud.mapper;


import cn.edu.ldu.watercloud.entity.Charge_day;
import cn.edu.ldu.watercloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {

    Charge_day selectByUserAndUseWaterAndProject();
}
