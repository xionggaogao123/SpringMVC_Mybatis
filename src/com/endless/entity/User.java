package com.endless.entity;

public class User {
    private Integer age, uid, did;
    private String username, password, email, sex;

    public Integer getDid() {
	return did;
    }

    public void setDid(Integer did) {
	this.did = did;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
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

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public Integer getUid() {
	return uid;
    }

    public void setUid(Integer uid) {
	this.uid = uid;
    }

    @Override
    public String toString() {
	return username + "\t" + password + "\t" + email + "\t" + sex + "\t" + age + "\t" + did + "\t" + uid;
    }
}
