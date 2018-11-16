package com.example.demo.service.impl;

import com.example.demo.service.CaptureImgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by HuangYanfei on 2018/11/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CaptureImgServiceImplTest {

    @Autowired
    CaptureImgService captureImgService;
    @Test
    public void test(){
        try {
            String path=captureImgService.captureImg(null,
                    "pdfRadar?companyId=" + URLEncoder.encode("", "utf8")
                            + "&keyValue=" + URLEncoder.encode("", "utf8"), "600px*500px");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}