package com.iu.s1.bankbook;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.iu.s1.util.ActionFoward;

public class BankBookService {
	
	private BankBookDAO bankBookDAO;
	
	public void setBankBookDAO(BankBookDAO bankBookDAO) {
		this.bankBookDAO = bankBookDAO;
	}

	public ActionFoward getSelect(HttpServletRequest request) throws Exception {
		ActionFoward actionFoward = new ActionFoward();
		
		long bookNumber = Long.parseLong(request.getParameter("bookNumber"));
		
		BankBookDTO bankBookDTO = bankBookDAO.getSelect(bookNumber);
		
		
		actionFoward.setCheck(true);
		actionFoward.setPath("../WEB-INF/bankbook/bankbookSelect.jsp");
		request.setAttribute("dto", bankBookDTO);
		
		
		
		return actionFoward;
	}
	
	//getList dao의 getList 호출
	public ActionFoward getList(HttpServletRequest request) throws Exception {
		ActionFoward actionFoward = new ActionFoward();
		List<BankBookDTO> ar = bankBookDAO.getList();
		
		request.setAttribute("list", ar);
		actionFoward.setPath("../WEB-INF/bankbook/bankbookList.jsp");
		actionFoward.setCheck(true);
		
		return actionFoward;
		
	}

}
