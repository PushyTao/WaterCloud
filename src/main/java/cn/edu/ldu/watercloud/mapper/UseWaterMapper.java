package cn.edu.ldu.watercloud.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
@Mapper
public interface UseWaterMapper {
    double queryByQuarter();
}
