package pjs07_mvc_gifti.controller.member;

import javax.servlet.http.*;
  
public interface Action {
	public ActionForward execute(HttpServletRequest request,
								HttpServletResponse response) throws Exception;

}
