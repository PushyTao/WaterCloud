package cn.edu.ldu.watercloud.entity.result;

import lombok.*;

/**
 * @author wuyt
 * @data 2022/6/8
 * @apiNote
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterEveryQuarter {
    private String userName;
    private String userId;
    private String year;
    private String thisQuarter;

}
