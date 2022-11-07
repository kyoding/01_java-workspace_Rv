package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 필드부 선언!
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 *  * 생성자
	 *  [표현법]
	 *  public 클래스명 ([매개변수1, 매개변수2 ...]) {
	 *  
	 *  }
	 *  
	 *  이거 왜 써야될까
	 *  * 생성자를 작성하는 목적
	 *  
	 *  1. 객체를 생성해주기 위한 목적
	 *  
	 *  * 생성자 작성시 유의사항
	 *  1. 반드시 생성자명은 클래스명과 동일해야됌 (대/소문자 구분) => 안그럼 오류남
	 *  2. 반환형이 존재하지 않음 (만일 반환형을 쓰게되면 메소드로 인식해버림)
	 *  3. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자를 JVM이 자동으로 만들어주지 않음
	 *  	즉, 어찌됐던 간에 기본생성자는 항상 작성하는 습관 들이자~~
	 *  
	 */
	
	public User() {
		// 기본생성자 (매개변수가 없는 생성자 
		// 단지 객체 생성만을 목적으로 할 때 사용
		System.out.println("이거 되나?");
	}
	// 매개변수 생성자가 있으면 기본생성자는 무조건 만들어야 함!!
	
	// 매개변수 생성자
	// 객체 생성과 동시에 전달값들 매개변수로 받아서 해당 각 필드에 초기화 할 목적
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		this(userId, userPwd, userName); // this 생성자 => 이렇게 하면 코드 간결하게 쓸 수 있음
		
		/*
		 *  위와 같이 중복되는 동일한 초기화 하는 내용의 생성자가 이미 존재할 경우
		 *  this() 생성자 활용 가능
		 *  => 같은 클래스 내에 생성자내에서 또 다른 생성자 호출하고자 할 때 사용됌
		 *  *** 
		 */
		
		this.age = age;
		this.gender = gender;
	}
	
	//getter setter
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 인포메이션
	
	public String information() {
		return "userId : " + userId + ", userPwd : " + userName + ", age : " + age + ", gender : " + gender;
		
	}
	
	
	
	
	
	
	

}
