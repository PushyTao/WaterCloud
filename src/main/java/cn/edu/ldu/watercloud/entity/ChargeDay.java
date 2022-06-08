package cn.edu.ldu.watercloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/* 
 * @Description: 收费日报
 * @Author: Chris(张文卓)
 * @Date: 2022/6/7 17:42
 */
public class ChargeDay {
    private String projectName;
    private int households;
    private double unitPrice;
    private int projectNumDay;
    private double projectPriceDay;
    private String time;
    private String salesman;
}
