package com.jarvis.diancanba.restaurant.controller;

import com.jarvis.diancanba.common.utils.FastDfsUtil;
import org.csource.common.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


/**
 * @Description:
 * @CreateDate: 2019/9/27 11:37
 * @UpdateUser: jarvis
 * @UpdateDate: 2019/9/27 11:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Controller
@RequestMapping("/image")
public class Upload {
    private static final String UPLOAD_PATH = "/static/upload/";
    @ResponseBody
    @RequestMapping(value = "/upload.do", method = RequestMethod.POST)
    public Map<String, Object> upload(MultipartFile dropFile, HttpServletRequest request) {
        /*Map<String, Object> result = new HashMap<>();
        System.out.println(dropFile);
        // Dropzone 上传
        if (dropFile != null) {
            result.put("fileName", writeFile(dropFile, request));
        }



        return result;*/
        Map<String, Object> result = new HashMap();
        if (dropFile != null) {
            FastDfsUtil fast = new FastDfsUtil();
            try {

                InputStream stream= new ByteArrayInputStream(dropFile.getBytes());
                String path = fast.fdfsUpload(stream, "jpg");
                System.out.println(path);

                result.put("fileName","192.168.232.132:8888"+path);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }


        return result;
    }



}
