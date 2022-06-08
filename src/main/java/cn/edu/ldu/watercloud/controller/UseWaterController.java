package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.entity.result.WaterEveryQuarter;
import cn.edu.ldu.watercloud.entity.result.WaterFormYear;
import cn.edu.ldu.watercloud.mapper.UseWaterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyt
 * @data 2022/6/7
 * @apiNote
 */

@RestController
@RequestMapping("/water")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
public class UseWaterController {
    @Autowired
    UseWaterMapper useWaterMapper;
    @PostMapping("/selectWaterFormYear")
    public List<WaterFormYear> SelectWaterFormYear() {
        List<WaterFormYear> ret = new ArrayList();

        List<WaterEveryQuarter> waterEveryQuarters = useWaterMapper.queryByQuarter(1);

        for(WaterEveryQuarter water:waterEveryQuarters) {
            WaterFormYear t = new WaterFormYear(water.getUserName(), water.getUserId(), water.getYear());
            t.setQ1st(water.getThisQuarter());
            ret.add(t);
        }
        int siz = waterEveryQuarters.size();
        System.out.println(ret.size());
        for(int i = 2;i <= 4;i ++) {
            List<WaterEveryQuarter> tmp = useWaterMapper.queryByQuarter(i);
            int idx = 0;
            for(WaterEveryQuarter t:tmp) {
                if(i == 2) ret.get(idx).setQ2nd(t.getThisQuarter());
                else if(i == 3) ret.get(idx).setQ3rd(t.getThisQuarter());
                else if(i == 4) ret.get(idx).setQ4th(t.getThisQuarter());
                idx += 1;
            }
        }
        return ret;
    }
}
