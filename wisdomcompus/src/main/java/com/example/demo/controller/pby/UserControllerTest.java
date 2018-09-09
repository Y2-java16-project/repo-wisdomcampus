package com.example.demo.controller.pby;
//https://blog.csdn.net/xiaolyuh123/article/details/73281522
//https://www.cnblogs.com/aston/p/7259825.html
//https://www.cnblogs.com/qlong8807/p/7121522.html
//https://blog.csdn.net/yuanquanl/article/details/73107210
//https://www.cnblogs.com/lyy-2016/p/6122144.html  接口

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import com.alibaba.fastjson.JSONObject;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {


//@Autowired
     private MockMvc mockMvc;
    
     @Autowired
     UserController userController ;
     
     @Autowired  
     private WebApplicationContext wac;  
     
	 @Before
	 public void setup(){
		 //MockMvcBuilders使用构建MockMvc对象   （项目拦截器有效）
		
		 mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  
	
		 //单个类  拦截器无效
	
	     // mockMvc = MockMvcBuilders.standaloneSteup(userController).build(); 
     }
 
 
	@Test
	public void testInfo() throws Exception {
		/*JSONObject param = new JSONObject() ;
		param.put("userId", "");
		String jsonstr = param.toString() ;
		System.out.println("================================请求入参："+jsonstr);
		RequestBuilder request = MockMvcRequestBuilders.get("/selectStudentexamAll") //请求的路径
		.contentType(MediaType.APPLICATION_JSON_UTF8)  // 字符
		.header("SESSIONNO", "")
		.content("json") ;
	
	    MvcResult mvcResult = mockMvc.perform(request).andReturn() ;
	   
	    int status = mvcResult.getResponse().getStatus();  
	    String content = mvcResult.getResponse().getContentAsString();
	        
	    Assert.assertTrue("正确", status == 200);  
	    Assert.assertFalse("错误", status != 200);  
	    
	    System.out.println("返回结果："+status);
	    System.out.println(content);
*/
		MvcResult result = mockMvc.perform(get("/selectStudentexamAll"))//执行请求  
		        .andReturn(); //返回MvcResult  
		Assert.assertNotNull(result.getModelAndView()); //自定义断言   
	}
} 