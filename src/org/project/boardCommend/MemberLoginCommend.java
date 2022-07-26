package org.project.boardCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.boardDao.BoardDao;

public class MemberLoginCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		

		int custNo = Integer.parseInt(request.getParameter("custNo"));
		String custName = request.getParameter("custName");
		String url = "";
		BoardDao dao = BoardDao.getInstance();
		int login = dao.loginOk(custNo, custName);
		
		HttpSession session = request.getSession();
		if(login!=1) {
			url = "/login.jsp";
		}else {
			url = "memberListView.do";
			session.setAttribute("sessionId", custName);
		}
		request.setAttribute("url", url);
	}
}
