package org.project.boardCommend;

import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardDao.BoardDao;

public class MemberInsertCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
			String url = "";
			int custNo = Integer.parseInt(request.getParameter("custNo"));
			String custName = request.getParameter("custName");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			
//			SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
//			String strDate = request.getParameter("joinDate");
//			Date joinDate = new Date(strDate);
//			System.out.println(strDate + " -> " + joinDate);
			
			String joinDate = request.getParameter("joinDate");
			String grade = request.getParameter("grade");
			String city = request.getParameter("city");
		
			BoardDao dao = BoardDao.getInstance();
			int rs = dao.insertDo(custNo, custName, phone, address, joinDate, grade, city);
			
			if(rs!=1) {
				url = "index.do";
			}else {
				url = "memberListView.do";
			}
			
			request.setAttribute("url", url);
	}
	
}
