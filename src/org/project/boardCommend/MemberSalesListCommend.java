package org.project.boardCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardDao.BoardDao;
import org.project.boardDto.memberSaleDto2;

public class MemberSalesListCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "";
		int custNo = Integer.parseInt(request.getParameter("custNo"));
		BoardDao dao = BoardDao.getInstance();
		ArrayList<memberSaleDto2> salesList2 = dao.membarSalesList(custNo);
		
		if(salesList2!=null) {
			url = "/memberSalesList.jsp";
			request.setAttribute("salesList2", salesList2);
		}else {
			url = "memberSalesView.do";
		}
		request.setAttribute("url", url);
	}
}
