package com.linfeng;

import com.google.gson.Gson;
import com.linfeng.bean.Student;

public class GsonTest01 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("linlan");
		student.setAge(24);
		Gson gson = new Gson();
		String jsonStr = gson.toJson(student);
		System.out.println(jsonStr);
		//fromJson
		Student st1 = gson.fromJson(jsonStr,Student.class);
		System.out.println(st1);
		System.out.println(st1.getName());
		//javabean convert JsonStr:
	}
}
