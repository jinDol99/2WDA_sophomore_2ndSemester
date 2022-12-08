package pjs07_mvc_gifti.controller.prd;

import pjs07_mvc_gifti.controller.prd.*;
import pjs07_mvc_gifti.model.controller.prd.action.*;
import pjs07_mvc_gifti.model.prd.*;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class prdFrontController extends HttpServlet implements Servlet {
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		command = RequestURI.substring(command.lastIndexOf("/"));
		
		
//		HttpSession session = request.getSession();
//		BeerPageInfoVO bpiVO;
//		
//		if( session.getAttribute("beerPageInfoVO") == null) {
//			bpiVO = new BeerPageInfoVO();
//			session.setAttribute("beerPageInfo", bpiVO);
//		} else {
//			bpiVO = (BeerPageInfoVO)session.getAttribute("beerPageInfoVO");
//		}
		
		ActionForward forward = null;
		Action action = null;
		
		switch (command) {
		case "/insertPrd.pr":
			action = new InsertPrdAction();
			break;
		default:
			System.out.println("[prdFrontController.java] 알 수 없는 command");
//			action = new DefaultAction();
			break;
		}
		
		try {
			forward = action.execute(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doProcess(request, response);
	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doProcess(request, response);
	}
}
