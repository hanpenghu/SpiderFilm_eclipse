package com.you_fuli.spiderFilm.controller.test;

public class Man {
	private String name=null;
	private Integer age=null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Man [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
	
}
