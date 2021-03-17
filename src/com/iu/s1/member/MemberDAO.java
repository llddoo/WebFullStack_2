package com.iu.s1.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.driver.DBConversion;

public class MemberDAO {
	
	//memberJoin 데이터를 받아서 DB에 insert 하는 메서드
	public int memberJoin(MemberDTO memberDTO)throws Exception{
		//1. 로그인 정보 
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 클래스 로딩
		Class.forName(driver);
		
		//3. 로그인 Connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//4. SQL
		String sql ="insert into member values(?,?,?,?,?)";
		
		//5. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//6. ? 세팅
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		st.setString(3, memberDTO.getName());
		st.setString(4, memberDTO.getEmail());
		st.setString(5, memberDTO.getPhone());
		
		//7. 최종 전송 후 처리
		int result = st.executeUpdate();
		
		//8. 해제
		st.close();
		con.close();
		
		return result;
		
	}
	
	
	//login - id pw를 받아서 조회
	public MemberDTO login(MemberDTO memberDTO)throws Exception{
		
		//1. 로그인 정보 
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 클래스 로딩
		Class.forName(driver);
		
		//3. 로그인 Connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		//4. SQL문 생성
		String sql ="SELECT * FROM member WHERE id=? and pw=?";
		
		//5. 미리 보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//6. ? 세팅
		st.setString(1, memberDTO.getId());
		st.setString(2, memberDTO.getPw());
		
		//7. 최종 전송 후 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			memberDTO.setName(rs.getString("name"));
			memberDTO.setEmail(rs.getString("email"));
			memberDTO.setPhone(rs.getString("phone"));
		}else {
			memberDTO = null;
		}
		
		//8. 해제
		rs.close();
		st.close();
		con.close();
		
		return memberDTO;
	}

}