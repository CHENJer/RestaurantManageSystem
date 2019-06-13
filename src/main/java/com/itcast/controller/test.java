package com.itcast.controller;

import java.io.IOException;

import com.itcast.pojo.User;
import com.itcast.util.QRCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcast.service.UserService;

@Controller
@RequestMapping("/SystemManager")
public class test {

	//简单页面测试
	@RequestMapping("/test")
	public String ssmTest1() {
		System.out.println("跳转成功");
		return "success";
	}

	//二维码生成测试
	@RequestMapping(value = "/qrcodeimg", method = RequestMethod.GET,produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String getImg() {
		String qrCodeImgBase = null;
		QRCodeUtil qrcode = new QRCodeUtil();
		try {
			qrCodeImgBase = qrcode.getQRCodeImg();
			System.out.println(qrCodeImgBase);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return qrCodeImgBase;
	}

	//前后端数据交互
		@RequestMapping(value = "Vuetest", method = RequestMethod.GET,produces="text/plain;charset=UTF-8")
		@ResponseBody
		public String ssmandVueTest() {
			System.out.println("跳转成功");
			String foods = "{\"goods\":[{\"name\":\"aaa\",\"type\":2,\"foods\":{\"name\":\"bbb\",\"description\":\"aaa\"}},\n" +
					"         {\"name\":\"aaa\",\"type\":2,\"foods\":{\"name\":\"bbb\",\"description\":\"aaa\"}},\n" +
					"{\"name\":\"aaa\",\"type\":2,\"foods\":{\"name\":\"bbb\",\"description\":\"aaa\"}},\n" +
					"{\"name\":\"aaa\",\"type\":2,\"foods\":{\"name\":\"bbb\",\"description\":\"aaa\"}},\n" +
					"{\"name\":\"aaa\",\"type\":2,\"foods\":{\"name\":\"bbb\",\"description\":\"aaa\"}},\n" +
					"{\"name\":\"aaa\",\"type\":2,\"foods\":{\"name\":\"bbb\",\"description\":\"aaa\"}}\n" +
					"        ]}";
			return foods;
		}

	@Autowired
	public UserService userService;
	//ssm整合测试
	@RequestMapping("/queryUserById")
	public String ssm() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println("ssm整合成功\n"+user);
		return "success";

	}


}
