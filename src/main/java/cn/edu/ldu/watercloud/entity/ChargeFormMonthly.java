package cn.edu.ldu.watercloud.entity;

import lombok.*;

@Data//lombok
@NoArgsConstructor//无参构造
@Getter
@Setter
@AllArgsConstructor//全参构造
@ToString
public class ChargeFormMonthly {
    private String projectName;//项目名
    private int households;//户数
    private double unitPrice;//单价
    private double projectNumMonthly;//数量
    private double projectPriceMonthly;//金额
    private int time;
    private String salesman;
}
