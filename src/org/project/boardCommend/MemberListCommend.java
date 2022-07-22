package org.project.boardCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardDao.BoardDao;
import org.project.boardDto.Member_tbl_02;

public class MemberListCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "";
		BoardDao dao = BoardDao.getInstance();
		ArrayList<Member_tbl_02> list = dao.listDo();
		
		if(list!=null) {
			url = "/memberList.jsp";
			request.setAttribute("list", list);
		}else {
			url = "index.do";
		}
		
		request.setAttribute("url", url);
	}
}
