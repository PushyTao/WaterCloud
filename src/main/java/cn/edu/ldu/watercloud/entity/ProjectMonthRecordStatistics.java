package cn.edu.ldu.watercloud.entity;

import lombok.*;

/**
 * @author wuyt
 * @data 2022/6/8
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//项目月记录统计
public class ProjectMonthRecordStatistics {
    private String projectName;
    private String lastMonthSum;
    private String curMonthNew;
    private String curMonthSum;
    private String curMonthQuit;
    private String curMonthGet;
    private String curMonthNotGet;
    private String up8;
    private String down8;
}
