package com.linfeng;

public class GsonTest2 {
	public static void main(String[] args) {
		String str = "{\"sites\":[{\"name\":\"菜鸟教程\",\"url\":\"www.runoob.com\"},{\"name\":\"google\",\"url\":\"www.google.com"
				+ "\"},{\"name\":\"微博\",\"url\":\"www.weibo.com\"}]}";
		str =str.replace('\\', '\b');
		System.out.println(str);
	}
}
