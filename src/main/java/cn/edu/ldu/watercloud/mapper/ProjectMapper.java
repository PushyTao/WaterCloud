package cn.edu.ldu.watercloud.mapper;


import cn.edu.ldu.watercloud.entity.ChargeDay;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProjectMapper {

    ChargeDay selectByUserAndUseWaterAndProject();
}
