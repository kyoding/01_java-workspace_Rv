package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값세팅) 까지 진행해줬음!!
		
		// 셋팅시작
		
		p.setId("minkyo");
		p.setPwd("qwe123");
		p.setName("정민교");
		p.setAge(28);
		p.setGender('M');
		p.setPhone("010-7350-7626");
		p.setEmail("minkyo0816@gmail.com");
		
		// 출력해보기
		
		System.out.println("아이디 : " + p.getId());
		System.out.println("비밀번호 : " + p.getPwd());
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("성별 : " + p.getGender());
		System.out.println("휴대폰번호 : " + p.getPhone());
		System.out.println("이메일 : " + p.getEmail());
		
		System.out.println();
		System.out.println("==================");
		System.out.println();
		
		// 프로덕트
		
		Product p1 = new Product();
		p1.setpName("에어포스");
		p1.setPrice(129000);
		p1.setBrand("나이키");
		
		System.out.println(p1.information());
		
		// === Person 생성자 ===
		
		System.out.println();
		System.out.println("==================");
		
		// 기본
		Person p3 = new Person();
		System.out.println(p3.information());
		
		// 이름 비번 나이 폰번호
		Person p4 = new Person("김땡땡", "123qwe", 20, "010-1234-5678");
		System.out.println(p4.information());
		
		// 전체
		Person p5 = new Person("id01", "123qwe", "김땡땡", 20, 'M', "010-1234-5678", "DDD@gmail.com");
		System.out.println(p5.information());
		
		

	}

}
