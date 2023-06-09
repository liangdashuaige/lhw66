package com.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    testController testController;

    @Test
    public  void contextLoads() {
        String result = testController.asyHello();
        System.out.println("单元测试返回===" + result);
    }
//    @Autowired
//    Student student;
//
//    @Test
//    public void getStudent()  throws Exception;
//

}
