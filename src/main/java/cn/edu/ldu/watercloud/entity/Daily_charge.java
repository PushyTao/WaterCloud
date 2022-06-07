package cn.edu.ldu.watercloud.entity;

import lombok.*;

@Data//lombok
@NoArgsConstructor//无参构造
@Getter
@Setter
@AllArgsConstructor//全参构造
@ToString
public class Daily_charge {
    private String project_name;//项目名
    private int house_num;//户数
    private double water_price;//单价
    private double amount_sum;//数量
    private double cost_sum;//金额

}
