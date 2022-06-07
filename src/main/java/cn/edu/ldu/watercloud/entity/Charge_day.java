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
public class Charge_day {
    private String projname;
    private int user_sum;
    private double price;
    private int water_sum;
    private double money;
    private String date;
}
