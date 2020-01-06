package com.lanou.rollCall;

public class Person {
 private String name;
 private String num;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(String name, String num) {
	super();
	this.name = name;
	this.num = num;
}
@Override
public String toString() {
	return "Person [name=" + name + ", num=" + num + "]";
}
	
	
	
}
