package com.fw;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.fw.domain.UserExcelMode;
import com.fw.utils.UserExcelModelListener;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class ReadExcelApplicationTests {

    @Test
    void contextLoads() {

    }
    //读取到列表
    @Test
    public void testReadList() throws Exception {
        // 读取 excel 表格的路径
        String readPath = ResourceUtils.getFile("classpath:hello.xlsx").toString();;

        try {
            Sheet sheet = new Sheet(1,1, UserExcelMode.class);
            EasyExcelFactory.readBySax(new FileInputStream(readPath),sheet,new UserExcelModelListener());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
