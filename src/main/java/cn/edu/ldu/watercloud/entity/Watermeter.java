package cn.edu.ldu.watercloud.entity;


import lombok.*;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */
@Data//lombok
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
public class Watermeter {
    private int id;
    private double settleflow;
    private double totalflow;
    private double lastflow;
    private double banalnce;
    private double status;
}
