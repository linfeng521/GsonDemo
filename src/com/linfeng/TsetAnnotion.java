package com.linfeng;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.linfeng.bean.StudentAnnotion;

public class TsetAnnotion {
	public static void main(String[] args) {
		StudentAnnotion sta = new StudentAnnotion("lin","lan","simple_days@qq.com","shanxi","a123456");
		/*Gson gson = new Gson();
		String gsonString = gson.toJson(sta);
		System.out.println(gsonString);*/
		Gson gson = new GsonBuilder().setVersion(0.9).setPrettyPrinting().create();
		System.out.println(gson.toJson(sta));
			
	}
}
