package org.project.boardDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import org.project.boardDto.Member_tbl_02;
import org.project.boardDto.memberSaleDto;
import org.project.boardDto.memberSaleDto2;
import org.project.dbconnect.DBConnect;

public class BoardDao {

	private static final BoardDao INSTANCE = new BoardDao();
	private BoardDao() {}
	public static BoardDao getInstance() {
		return INSTANCE;
	}
//	private static class SingleTon{
//		private static final BoardDao INSTANCE = new BoardDao();
//	}
//	private BoardDao() {}
//	public static BoardDao getInstance() {
//		return SingleTon.INSTANCE;
//	}
	
	public int insertDo(int custNo, String custName, String phone, String address, String joinDate, String grade,
			String city) {
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, custNo);
			pstm.setString(2, custName);
			pstm.setString(3, phone);
			pstm.setString(4, address);
			pstm.setString(5, joinDate);
			pstm.setString(6, grade);
			pstm.setString(7, city);
			
			rs = pstm.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return rs;
	}
	// 홈쇼핑 회원 등록 페이지
	public int custNoMax() {
		int custNo = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "select max(custNo)+1 from member_tbl_02";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				custNo = rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return custNo;
	}
	public ArrayList<Member_tbl_02> listDo() {
		ArrayList<Member_tbl_02> list = new ArrayList<Member_tbl_02>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member_tbl_02 order by custNo asc";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
			 	int custNo = rs.getInt(1);
				String custName = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				Date joinDate = rs.getDate(5);
				String grade = rs.getString(6);
				String city = rs.getString(7);
				
				list.add(new Member_tbl_02(custNo, custName, phone, address, joinDate, grade, city));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return list;
	}
	public ArrayList<memberSaleDto> membarSales() {
		ArrayList<memberSaleDto> memberSales = new ArrayList<memberSaleDto>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select m1.custno, m1.custname, m1.grade, sum(m2.price) from member_tbl_02 m1 inner join money_tbl_02 m2 on m1.custno=m2.custno group by(m1.custno, m1.custname, m1.grade) order by(sum(m2.price)) desc";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				
				int custNo = rs.getInt(1);
				String custName = rs.getString(2);
				String grade = rs.getString(3);
				int price = rs.getInt(4);
				
				memberSales.add(new memberSaleDto(custNo, custName, grade, price));
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return memberSales;
	}
	public Member_tbl_02 memberViewDo(int custNo) {
		Member_tbl_02 memberView = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select * from member_tbl_02 where custNo=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, custNo);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
//				int custNo = rs.getInt(1);
				String custName = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				Date joinDate = rs.getDate(5);
				String grade = rs.getString(6);
				String city = rs.getString(7);
				
				memberView = new Member_tbl_02(rs.getInt(1), custName, phone, address, joinDate, grade, city);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return memberView;
	}
	public int updateDo(int custNo, String custName, String phone, String address, String joinDate, String grade,
			String city) {
		int rs = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "update member_tbl_02 set custName=?, phone=?, address=?, joinDate=?, grade=?, city=? where custNo=?";
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1, custName);
			pstm.setString(2, phone);
			pstm.setString(3, address);
			pstm.setString(4, joinDate);
			pstm.setString(5, grade);
			pstm.setString(6, city);
			pstm.setInt(7, custNo);
			
			rs = pstm.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		return rs;
	}
	public ArrayList<memberSaleDto2> membarSalesList(int custNo) {
//		memberSaleDto salesList = null;
		ArrayList<memberSaleDto2> salesList2 = new ArrayList<memberSaleDto2>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";
		
		try {
			conn = DBConnect.getConnection();
			query = "select m1.custno, m1.custname, m1.grade, m2.price,m2.pcode, m2.sDate from member_tbl_02 m1 inner join money_tbl_02 m2 on m1.custno=m2.custno where m1.custno=? order by(sDate) desc";
			pstm = conn.prepareStatement(query);
			
			pstm.setInt(1, custNo);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				
//				int custNo = rs.getInt(1);
				String custName = rs.getString(2);
				String grade = rs.getString(3);
				int price = rs.getInt(4);
				String pcode = rs.getString(5);
				Date sDate = rs.getDate(6);
				
				salesList2.add(new memberSaleDto2(custNo, custName, grade, price, pcode, sDate));
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)conn.close();
				if(pstm!=null)pstm.close();
				if(rs!=null)rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		
		return salesList2;
	}
	
}
