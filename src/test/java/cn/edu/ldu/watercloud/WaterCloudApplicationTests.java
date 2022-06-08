package cn.edu.ldu.watercloud;

import cn.edu.ldu.watercloud.entity.Daily_charge;
//import cn.edu.ldu.watercloud.entity.Monthly_charge;
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
	/*@Test
	public void testQueryByQuarter() {
		double ans = useWaterMapper.queryByQuarter(1);
		System.out.println(ans);
	}*/
	@Test
	public void testQuery() {
		List ret = new ArrayList<>();
		ret.add("wuyt");
		ret.add("1");
		ret.add("2022");
		ret.add("1");
		ret.add("2");
		ret.add("3");
//		ret.add(String.valueOf(useWaterMapper.queryByQuarter()));
//        useWaterMapper.queryByQuarter();
//		return ret;
		System.out.println(ret.toString());
	}
	/*
	@Test
	public void test_Daily_charge_and_Monthly_charge(){
		String str = "2022-06-07";
		//现将年月日切分出来
		String[] arr = str.split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		List<Daily_charge> list = projectMapper.daily_charge(year,month,day);
		for (Daily_charge i: list) {
			System.out.println(i.toString());
		}
		List<Monthly_charge> list2 = projectMapper.monthly_charge(year,month);
		for (Monthly_charge i: list2){
			System.out.println(i.toString());
		}
	}

	 */
}
