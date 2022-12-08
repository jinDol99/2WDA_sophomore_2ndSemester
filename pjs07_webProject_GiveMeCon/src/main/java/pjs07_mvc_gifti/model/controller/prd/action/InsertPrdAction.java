package pjs07_mvc_gifti.model.controller.prd.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;
import pjs07_mvc_gifti.controller.prd.Action;
import pjs07_mvc_gifti.controller.prd.ActionForward;
import pjs07_mvc_gifti.model.prd.*;

public class InsertPrdAction implements Action {
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		prdDAO prdDAO = new prdDAO();
		prdDTO prd = new prdDTO();

//		prd.setP_code(Integer.parseInt(request.getParameter("p_code")));
		prd.setP_name(request.getParameter("p_name"));
		prd.setP_category(request.getParameter("p_category"));
		prd.setP_img(request.getParameter("p_img"));
		prd.setP_barcode(request.getParameter("p_barcode"));
		prd.setP_limDate(request.getParameter("p_limDate"));
		prd.setP_orgnPrice(Integer.parseInt(request.getParameter("p_orgnPrice")));
		prd.setP_salePrice(Integer.parseInt(request.getParameter("p_salePrice")));
		prd.setP_discription(request.getParameter("p_discription"));

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