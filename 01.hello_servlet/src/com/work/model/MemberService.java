package com.work.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* 회원 관리를 위한 업무로직(서비스)을 모델링한 클래스 */
public class MemberService {
	// 회원 관리 테스트를 위한 자료 저장구조 Collection (ArrayList)
	// DB없이 접근하기 위한 static 구조
	private static ArrayList<Member> list = new ArrayList<Member>();

	/**
	 * 기본생성자 초기 테스트를 위한 회원 객체 3명 생성
	 */
	public MemberService() {
		list.add(new Member("user01", "password01", "홍길동", "010-1111-1111", "user01@work.com", "2019-03-15", "G", 500, ""));
		list.add(new Member("user02", "password02", "이순신", "010-2222-2222", "user02@work.com", "2019-04-20", "S", 0, "송중기"));
		list.add(new Member("user03", "password03", "김유신", "010-3333-3333", "user03@work.com", "2018-12-25", "A", 0, ""));
	}

	public String login(String memberId, String memberPw) {
		for (Member member : list) {
			if(member.getMemberId().equals(memberId) && member.getMemberPw().equals(memberPw))
				return member.getGrade();
		}
		return null;
	}

	public boolean signup(Member m) {
		for (Member member : list) {
			if(member.getMemberId().equals(m.getMemberId()))
				return false;
		}
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		m.setEntryDate(dateFormat.format(date));
		m.setGrade("G");
		m.setMileage(0);
		return list.add(m);
	}

	public String logout(String memberId, String memberPw) {
		return null;
	}

	public String idFind(String memberName, String email) {
		return null;
	}
}
