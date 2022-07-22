package org.project.boardCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardDao.BoardDao;

public class MemberCustNoMaxCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "";
		
		BoardDao dao = BoardDao.getInstance();
		int custNo = dao.custNoMax();
		if(custNo!=0) {
			System.out.println("OK");
			request.setAttribute("custNo", custNo);
			url = "/join.jsp";
		}else {
			url = "index.do";
		}
		request.setAttribute("url", url);
		
	}
}
