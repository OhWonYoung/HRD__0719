package org.project.boardCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardDao.BoardDao;
import org.project.boardDto.Member_tbl_02;

public class MemberViewCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int custNo = Integer.parseInt(request.getParameter("custNo"));
		String url = "";
		BoardDao dao = BoardDao.getInstance();
		Member_tbl_02 memberView = dao.memberViewDo(custNo);
		
		if(memberView!=null) {
			url = "/memberView.jsp";
			request.setAttribute("memberView", memberView);
		}else {
			url = "memberList.do";
		}
		request.setAttribute("url", url);
	}
}
