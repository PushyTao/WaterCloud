package cn.edu.ldu.watercloud.controller;

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
@RequestMapping("/yiqing_war/water")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
public class UseWaterController {
    @Autowired
    UseWaterMapper useWaterMapper;
    @PostMapping("/selectWaterFormYear")
    public List<WaterFormYear> SelectWaterFormYear() {
        List ret = new ArrayList();
        WaterFormYear  waterFormYear = new WaterFormYear("wuyt","1","2022","1",
                "2","3",String.valueOf(useWaterMapper.queryByQuarter()));
        ret.add(waterFormYear);
        ret.add(waterFormYear);
        ret.add(waterFormYear);
        System.out.println("request +1");
        return ret;
    }
}
