package com.example.demo.controller.pby;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class MyFileController {
	//制作参考网页
	//https://www.cnblogs.com/jingch/p/5036686.html
	//
    @RequestMapping("upload")
    @ResponseBody
    public String getfile(@RequestParam("myfile") MultipartFile file){
        System.out.println("file name = "+file.getOriginalFilename());
 
        // 获取文件名
        String fileName = file.getOriginalFilename();
        // 获取后缀
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 文件上产的路径
        String filePath = "D:\\LY\\repo-wisdomcampus\\wisdomcompus\\src\\main\\resources\\static\\pby\\fileimg\\";
        // fileName处理
        fileName = filePath+ UUID.randomUUID()+fileName;
        System.out.println("文件："+fileName);
        // 文件对象
        File dest = new File(fileName);
        // 创建路径
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }
 
        try {
            file.transferTo(dest);
            return "{\"name\":\"../../pby/fileimg/43066d2e-0420-4082-a6fe-e8a82c6bd215001.jpg\"}";
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        return "上传失败";
    }
 
    @RequestMapping("download")
    public void download(HttpServletResponse response) throws FileNotFoundException {
        File file =new File("C:\\Users\\Dell\\Desktop\\20180830170054.jpg");
        FileInputStream fileInputStream=new FileInputStream(file);
        // 设置被下载而不是被打开
        response.setContentType("application/gorce-download");
        // 设置被第三方工具打开,设置下载的文件名
        response.addHeader("Content-disposition","attachment;fileName=spring-boot-reference.pdf");
        try {
            OutputStream outputStream = response.getOutputStream();
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}