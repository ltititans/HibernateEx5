package com.lti.hibernate_ex2.Student_Project;

public class Student {
private int id;
private String name;
private String domain;
public Student(int id, String name, String domain) {
	super();
	this.id = id;
	this.name = name;
	this.domain = domain;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", domain=" + domain + "]";
}

}
