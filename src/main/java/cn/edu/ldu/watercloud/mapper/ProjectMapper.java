package cn.edu.ldu.watercloud.mapper;

import cn.edu.ldu.watercloud.entity.ChargeDay;
import cn.edu.ldu.watercloud.entity.Daily_charge;
import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/* 
 * @Description: 项目日报/月报
 * @Author: Chris(张文卓)
 * @Date: 2022/6/10 8:43
 */
@Mapper
public interface ProjectMapper {

    List<ChargeDay> selectByUserAndUseWaterAndProject();

    List<ChargeFormMonthly> monthly_charge();


}
