package com.study.main;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.study.model.GGRTuitionCircle;
import com.study.util.GgrTuitionDataUtil;

public class MyMain {
	
	public static void main(String[] args) {
	
	GgrTuitionDataUtil util = new GgrTuitionDataUtil();
	List<GGRTuitionCircle> tuitionStuList =util.getAllGgrTuitionCircle();
	System.out.println(tuitionStuList);
	System.out.println("**************************************");
	
	String jsonString = null;
	ObjectMapper mapper = new ObjectMapper();
	try {
		jsonString = mapper.writeValueAsString(tuitionStuList);
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
	System.out.println(jsonString);
	}

}
