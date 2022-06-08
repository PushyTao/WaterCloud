package cn.edu.ldu.watercloud.mapper;

import cn.edu.ldu.watercloud.entity.result.WaterEveryQuarter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
@Mapper
public interface UseWaterMapper {
    List<WaterEveryQuarter> queryByQuarter(int quarter);
}
