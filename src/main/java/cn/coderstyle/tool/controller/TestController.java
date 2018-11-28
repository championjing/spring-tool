package cn.coderstyle.tool.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.coderstyle.tool.config.PropertiesConfig;

@RestController
public class TestController {

	@Autowired
	private PropertiesConfig mapLoad; 
	
	@RequestMapping(value="/map")
	public String testMapLoad() {
		System.out.println("start");
		Map<String,String> map = mapLoad.map;
		for(String key: map.keySet()) {
			System.out.println("key:"+key);
			System.out.println("value:"+map.get(key));
		}
		return "OK";
	}
}
