package com.iu.s1.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iu.s1.util.ActionFoward;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private MemberService memberService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	memberService = new MemberService();
    	MemberDAO memberDAO = new MemberDAO();
    	memberService.setMemberDAO(memberDAO);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Member Controller!!!!");
		
		String path = request.getServletPath();
		String uri	= request.getRequestURI();
		System.out.println(path);
		System.out.println(uri);
		String result="";
		//subString으로 마지막 주소 
		//1. 자를려고 하는 시작 인덱스 번호 찾기
		int index = uri.lastIndexOf("/");
		//2. 해당 인덱스부터 잘라오기
		result = uri.substring(index+1);
		System.out.println(result);
		String pathInfo="";
		
		ActionFoward actionFoward=null;
		
		if(result.equals("memberLogin.do")) {
			System.out.println("로그인 처리");
			try {
				actionFoward = memberService.memberLogin(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("에러 발생");
				e.printStackTrace();
			}
					
		}else if(result.equals("memberJoin.do")) {

			try {
				actionFoward = memberService.memberJoin(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("에러 발생");
				e.printStackTrace();
			}
			
			
		}else {
			System.out.println("그 외 다른 처리");
		}
		
		if(actionFoward.isCheck()) {
			//foward
			RequestDispatcher view = request.getRequestDispatcher(actionFoward.getPath());
			view.forward(request, response);
		}else {
			//redirect
			response.sendRedirect(actionFoward.getPath());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}