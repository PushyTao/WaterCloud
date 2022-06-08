package cn.edu.ldu.watercloud.mapper;

import cn.edu.ldu.watercloud.entity.ProjectMonthRecordStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wuyt
 * @data 2022/6/8
 * @apiNote
 */
@Mapper
public interface ProjectMonthRecordStatisticsMapper {

    List<ProjectMonthRecordStatistics> queryAll(int yearmonthPre,int yearmonthCur, int yearmonthNext);

}
