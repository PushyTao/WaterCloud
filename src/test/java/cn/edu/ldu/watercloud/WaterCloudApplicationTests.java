package cn.edu.ldu.watercloud;

import cn.edu.ldu.watercloud.mapper.ProjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WaterCloudApplicationTests {

	@Autowired
	ProjectMapper projectMapper;

	@Test
	void contextLoads() {
		System.out.println(projectMapper.selectByUserAndUseWaterAndProject());
	}

}
