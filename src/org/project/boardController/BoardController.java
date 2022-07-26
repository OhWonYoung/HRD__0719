package org.project.boardController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.boardCommend.ExcuteCommend;
import org.project.boardCommend.MemberCustNoMaxCommend;
import org.project.boardCommend.MemberInsertCommend;
import org.project.boardCommend.MemberListCommend;
import org.project.boardCommend.MemberLoginCommend;
import org.project.boardCommend.MemberLogoutCommend;
import org.project.boardCommend.MemberSalesCommend;
import org.project.boardCommend.MemberSalesListCommend;
import org.project.boardCommend.MemberUpdateCommend;
import org.project.boardCommend.MemberViewCommend;

@WebServlet("*.do")
public class BoardController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length()+1, uri.length()-3);
		String url = "";
		ExcuteCommend commend = null;
		
		if(basicURL.equals("index")) {
			url = "/index.jsp";
		}else if(basicURL.equals("joinView")) {
			commend = new MemberCustNoMaxCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("joinOk")) {
			commend = new MemberInsertCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("memberListView")) {
			commend = new MemberListCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("memberSalesView")) {
			commend = new MemberSalesCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("memberView")) {
			commend = new MemberViewCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("memberUpdateOk")) {
			commend = new MemberUpdateCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("memberSalesList")) {
			commend = new MemberSalesListCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("loginView")) {
			url = "/login.jsp";
		}else if(basicURL.equals("loginOk")) {
			commend = new MemberLoginCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}else if(basicURL.equals("logoutOk")) {
			commend = new MemberLogoutCommend();
			commend.excuteQueryCommend(request, response);
			url = (String)request.getAttribute("url");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
	
}
