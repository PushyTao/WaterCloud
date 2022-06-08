package cn.edu.ldu.watercloud;

import cn.edu.ldu.watercloud.entity.Daily_charge;
import cn.edu.ldu.watercloud.entity.ChargeFormMonthly;
import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import cn.edu.ldu.watercloud.mapper.UseWaterMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class WaterCloudApplicationTests {

	@Autowired
	ProjectMapper projectMapper;

	@Autowired
	UseWaterMapper useWaterMapper;
	@Test
	void contextLoads() {
		System.out.println(projectMapper.selectByUserAndUseWaterAndProject());
	}
	@Test
	public void testQueryByQuarter() {
		double ans = useWaterMapper.queryByQuarter();
		System.out.println(ans);
	}
	@Test
	public void testQuery() {
		List ret = new ArrayList<>();
		ret.add("wuyt");
		ret.add("1");
		ret.add("2022");
		ret.add("1");
		ret.add("2");
		ret.add("3");
		ret.add(String.valueOf(useWaterMapper.queryByQuarter()));
//        useWaterMapper.queryByQuarter();
//		return ret;
		System.out.println(ret.toString());
	}

	@Test
	public void test_Daily_charge_and_Monthly_charge(){

		List<ChargeFormMonthly> list2 = projectMapper.monthly_charge();
		for (ChargeFormMonthly i: list2){
			System.out.println(i.toString());
		}
	}
//	@Test
//	public void test_project(){
//		List<ChargeDay> chargeDays = projectMapper.selectByUserAndUseWaterAndProject();
//		chargeDays.forEach(System.out::println);
//	}
}
