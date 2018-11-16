package com.example.demo.service.impl;

import com.example.demo.service.CaptureImgService;
import com.example.demo.service.ScreenCaptureService;
import com.example.demo.util.DateUtils;
import com.example.demo.util.ResourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by tuanhong on 2017-05-22.
 */
@Service
public class CaptureImgServiceImpl implements CaptureImgService {

//    @Value("${suxiu2.temp.path}")
    private String pdfPath = "E:/pdfpath/";

//    @Value("${suxiu2.page.url}")
    private String basePath = "https://huisheng99.b2b.hc360.com/";

    @Autowired
    private ResourceUtil resourceUtil;

    @Autowired
    private ScreenCaptureService phantomSer;

    @Override
    /**
     * 截屏
     **/
    public String captureImg(HttpServletRequest re, String url, String size) throws IOException {
        String img = "";

        //"./phantomjs rasterize.js https://www.baidu.com c.png A4"
//        String plugin = getImgPath(re, "sysplugins/./phantomjs");
        String plugin = resourceUtil.getFilePath("files/sysplugins/phantomjs");
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            plugin = resourceUtil.getFilePath("files/sysplugins/phantomjs.exe");
        }
        String js = resourceUtil.getFilePath("files/sysplugins/rasterize.js");

        File file = new File(this.pdfPath);
        if (!file.exists()) {
            file.mkdirs();
        }

        img = this.pdfPath + DateUtils.format(new Date(), "yyyyMMddHHmmss") + System.nanoTime() + ".png";

        String basePath = this.basePath;

        File pluginFile = new File(plugin);
        if (!pluginFile.canExecute()) {
            pluginFile.setExecutable(true);
        }

        File jsFile = new File(js);

//        url = basePath + url;
        url = "https://www.baidu.com/";

        if (!phantomSer.exec(plugin, jsFile.getAbsolutePath(), url, img, size)) {
            return null;
        }

        return img;
    }
}
