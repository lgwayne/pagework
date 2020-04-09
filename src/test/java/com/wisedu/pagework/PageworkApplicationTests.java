package com.wisedu.pagework;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wisedu.pagework.util.JsonUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class PageworkApplicationTests {

    @Test
    void contextLoads() {

        JSONObject jsonObject = JsonUtil.ConvertToJsonArray("templates/data.json", "RELATIVE_PATH");
        System.out.println(jsonObject);
//        System.out.println(jsonArray);

    }

}
