package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.mapper.UseWaterMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
public class UseWaterController {
    @Autowired
    UseWaterMapper useWaterMapper;
    @PostMapping("/selectWaterFormYear")
    public List SelectWaterFormYear() {
        List ret = new ArrayList<>();
        ret.add("wuyt");
        ret.add("1");
        ret.add("2022");
        ret.add("1");
        ret.add("2");
        ret.add("3");
        ret.add(String.valueOf(useWaterMapper.queryByQuarter()));
//        useWaterMapper.queryByQuarter();
        return ret;
    }
}
