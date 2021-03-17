package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

import com.iu.s1.util.ActionFoward;

public class MemberService {
	
	private MemberDAO memberDAO;
	
	
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	//memberLogin
	public ActionFoward memberLogin(HttpServletRequest request)throws Exception{
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		actionFoward.setPath("../WEB-INF/member/memberLogin.jsp");
		actionFoward.setCheck(true);
		if(method.toUpperCase().equals("POST")) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			memberDTO = memberDAO.login(memberDTO);
			actionFoward.setCheck(false);
			actionFoward.setPath("./memberLogin.do");
			if(memberDTO != null) {
				actionFoward.setPath("../index.do");
			}
			
		}
		
		return actionFoward;
		
	}
	
	

	public ActionFoward memberJoin(HttpServletRequest request)throws Exception{
		ActionFoward actionFoward = new ActionFoward();
		String method = request.getMethod();
		actionFoward.setPath("../WEB-INF/member/memberJoin.jsp");
		actionFoward.setCheck(true);
		if(method.toUpperCase().equals("POST")) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(request.getParameter("id"));
			memberDTO.setPw(request.getParameter("pw"));
			memberDTO.setName(request.getParameter("name"));
			memberDTO.setEmail(request.getParameter("email"));
			memberDTO.setPhone(request.getParameter("phone"));
			int result = memberDAO.memberJoin(memberDTO);
			actionFoward.setPath("../index.do");
			actionFoward.setCheck(false);
		}
		
		
		return actionFoward;
	}

}