package pjs07_mvc_gifti.model.controller.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
import pjs07_mvc_gifti.controller.member.Action;
import pjs07_mvc_gifti.controller.member.ActionForward;
import pjs07_mvc_gifti.model.member.*;
import pjs07_mvc_gifti.model.prd.prdDAO;
import pjs07_mvc_gifti.model.prd.prdDTO;

public class CompareLoginInfoAction implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		memDAO memDAO = new memDAO();
		memDTO mem = new memDTO();

		mem.setM_id(request.getParameter("m_id"));
		mem.setM_password(request.getParameter("m_password"));
		

		boolean result = prdDAO.insertPrd(prd);
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		
		if(result == true) {
			forward.setPath("/index.jsp");
		} else {
			forward.setPath("/com/yju/2wda/team2/view/etc/error.jsp");
		} return forward;
		 
	}
}
