package org.project.boardCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardDao.BoardDao;
import org.project.boardDto.memberSaleDto;

public class MemberSalesCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		BoardDao dao = BoardDao.getInstance();
		ArrayList<memberSaleDto> memberSales = dao.membarSales();
		String url = "";
		
		if(memberSales!=null) {
			url = "/memberSales.jsp";
			request.setAttribute("memberSales", memberSales);
		}else {
			url = "index.do";
		}
		
		request.setAttribute("url", url);
	}
}
