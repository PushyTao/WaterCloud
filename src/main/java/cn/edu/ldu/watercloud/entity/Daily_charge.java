package cn.edu.ldu.watercloud.entity;

import lombok.*;

@Data//lombok
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
public class Daily_charge {
    private String projectName;//项目名
    private int households;//户数
    private double unitPrice;//单价
    private double projectNumDay;//数量
    private double projectPriceDay;//金额

}
