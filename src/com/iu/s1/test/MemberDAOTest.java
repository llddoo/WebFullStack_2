package com.iu.s1.test;

import com.iu.s1.member.MemberDAO;
import com.iu.s1.member.MemberDTO;

public class MemberDAOTest {

	public static void main(String[] args) {
		//Web 에서 메인 메서드는 테스트 용도로만 사용
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		memberDTO.setName("iu");
		memberDTO.setEmail("iu@naver.com");
		memberDTO.setPhone("01011111111");
		
		try {
			int result = memberDAO.memberJoin(memberDTO);
			
			System.out.println(result != 0);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}