package cn.edu.ldu.watercloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterFeeByMonth {
    private String projectName;//项目名
    private Double price;//单价
    private Double balance;//本月结存
    private Double revenueVolume;//本月收入量
}
