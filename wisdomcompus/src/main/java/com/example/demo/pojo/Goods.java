package com.example.demo.pojo;

import java.util.HashMap;

import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONObject;

import com.baidu.aip.face.AipFace;
import com.example.demo.pby.util.ImageUtil;

public class Goods {
	 //设置APPID/AK/SK
    public static final String APP_ID = "你的 App ID";
    public static final String API_KEY = "你的 Api Key";
    public static final String SECRET_KEY = "你的 Secret Key";
    
  //定义AipFace
  private AipFace client; 

    public static void main(String[] args) {
        // 初始化一个AipFace
        AipFace client = new AipFace(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        //client.setHttpProxy("proxy_host", "https:192.168.8.177:8080");  // 设置http代理
        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        //String path = "test.jpg";
        //JSONObject res = client.detect(path, new HashMap<String, String>());
        //System.out.println(res.toString(2));
    }
  
  //人脸识别。从人脸库中查找相似度最高的1张图片
    public JSONObject identifyUserBybase64(String base64Str){
    	 // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        //options.put("ext_fields", "faceliveness");//判断活体
        options.put("user_top_num", "1");
        String groupId = "group1";
        byte[] byt = ImageUtil.base64StrToByteArray(base64Str);
        //return  client.identifyUser(groupId, byt, options);
        return  client.videoFaceliveness(groupId, byt, options);
    }
}
