package org.project.boardCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MemberLogoutCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "";
		HttpSession session = request.getSession();
		if(session!=null) {
			session.invalidate();
			url="index.do";
		}
		request.setAttribute("url", url);
	}
}
