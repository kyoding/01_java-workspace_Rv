package com.kh.chap03_class.model.vo;

public class Person {
	
	// 필드선언
	
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자 - 기본
	
	public Person() {
		System.out.println("Person 객체가 생성되었습니다.");
	}

	// 생성자 - 이름 비번 나이 폰번호
	
	public Person(String name, String pwd, int age, String phone) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.phone = phone;
	}
	
	// 생성자 - 전체 (id, pwd, name, age, gender, phone, email)
	
	public Person(String id, String pwd, String name, int age, char gender, String phone, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	// setter 만들기!
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter 만들기!
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	// 인포메이션 - 인포메이션은 관례적으로 맨 밑이다
	
	public String information() {
		return "아이디 : " + id + ", 패스워드 : " + pwd + ", 이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 폰번호 : " + phone + ", 이메일 : " + email;
	}
	
	
	
}
