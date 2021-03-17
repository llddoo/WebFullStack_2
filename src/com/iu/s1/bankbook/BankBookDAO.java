package com.iu.s1.bankbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BankBookDAO {
	
	//getList
	//bankbook table의 모든 데이트 조회 후 리턴
	public List<BankBookDTO> getList()throws Exception{
		ArrayList<BankBookDTO> ar = new ArrayList<>();
		
		//1. 로그인 정보 
		String user="user01";
		String password="user01";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 클래스 로딩
		Class.forName(driver);
		
		//3. 로그인 Connection
		Connection con = DriverManager.getConnection(url, user, password);
		
		String sql ="select * from bankbook";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			BankBookDTO bankBookDTO = new BankBookDTO();
			bankBookDTO.setBookNumber(rs.getLong("bookNumber"));
			bankBookDTO.setBookName(rs.getString("bookName"));
			bankBookDTO.setBookRate(rs.getDouble("bookRate"));
			bankBookDTO.setBookSale(rs.getString("bookSale"));
			ar.add(bankBookDTO);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return ar;
	}

}