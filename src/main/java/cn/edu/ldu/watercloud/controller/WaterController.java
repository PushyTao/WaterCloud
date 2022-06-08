package cn.edu.ldu.watercloud.controller;

import cn.edu.ldu.watercloud.entity.ChargeDay;
import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/water")
@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = "*", allowCredentials = "true")
public class WaterController {

    @Autowired
    ProjectMapper projectMapper;

    @PostMapping("/selectChargeFormDaily")
    public List<ChargeDay> charge_day(){
        List<ChargeDay> charge_day = projectMapper.selectByUserAndUseWaterAndProject();
        charge_day.forEach(System.out::println);
        return charge_day;
    }
}
