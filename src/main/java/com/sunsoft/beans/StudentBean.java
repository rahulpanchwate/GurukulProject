package com.sunsoft.beans;

public class StudentBean {
private int rollno;
private String name;
private String mname;
private String lname;
private String email;
private String sex;
private String course;
private int fee;
private int f_inst,s_inst,t_inst;
private int paid,due;
private String address,contact;

public StudentBean() {}

public StudentBean(String name, String email, String sex, String course, int fee, int paid, int due, String address,
		String contact) {
	super();
	this.name = name;
	this.email = email;
	this.sex = sex;
	this.course = course;
	this.fee = fee;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.contact = contact;
}

public StudentBean(int rollno, String name, String sex, String course, int fee, int paid, int due,
		String address, String contact) {
	super();
	this.rollno = rollno;
	this.name = name;
	//this.email = email;
	this.sex = sex;
	this.course = course;
	this.fee = fee;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.contact = contact;
}



public StudentBean(int rollno, String name, String sex, String course, int fee, int f_inst, int s_inst,
		int t_inst, int paid, int due, String address, String contact) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.email = email;
	this.sex = sex;
	this.course = course;
	this.fee = fee;
	this.f_inst = f_inst;
	this.s_inst = s_inst;
	this.t_inst = t_inst;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.contact = contact;
}

public StudentBean(int rollno, String name, String mname, String lname, String sex, String course,
		int fee, int f_inst, int s_inst, int t_inst, int paid, int due, String address, String contact) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.mname = mname;
	this.lname = lname;
	//this.email = email;
	this.sex = sex;
	this.course = course;
	this.fee = fee;
	this.f_inst = f_inst;
	this.s_inst = s_inst;
	this.t_inst = t_inst;
	this.paid = paid;
	this.due = due;
	this.address = address;
	this.contact = contact;
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public int getPaid() {
	return paid;
}
public void setPaid(int paid) {
	this.paid = paid;
}
public int getDue() {
	return due;
}
public void setDue(int due) {
	this.due = due;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

public int getF_inst() {
	return f_inst;
}

public void setF_inst(int f_inst) {
	this.f_inst = f_inst;
}

public int getS_inst() {
	return s_inst;
}

public void setS_inst(int s_inst) {
	this.s_inst = s_inst;
}

public int getT_inst() {
	return t_inst;
}

public void setT_inst(int t_inst) {
	this.t_inst = t_inst;
}

}
