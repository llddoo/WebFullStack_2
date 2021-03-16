package com.iu.s1.member;


import javax.servlet.http.HttpServletRequest;

import com.iu.s1.util.ActionFoward;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}



	public ActionFoward memberJoin(HttpServletRequest request) throws Exception {
		//DAO 메서드 호출
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		actionFoward.setPath("../WEB-INF/member/memberJoin.jsp");
		actionFoward.setCheck(true);
		if(method.toUpperCase().equals("POST")) { //equals는 비교하는것 
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			memberDTO.setName(request.getParameter("Name"));
			memberDTO.setEmail(request.getParameter("email"));
			memberDTO.setPhone(request.getParameter("phone"));
			int result = memberDAO.memberJoin(memberDTO);
			actionFoward.setPath("../index.do");
			actionFoward.setCheck(false);
		}
		return actionFoward;
		
	}
}
