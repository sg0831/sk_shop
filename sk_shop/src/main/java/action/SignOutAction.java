package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignOutAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String view = WEB_INF + "index.jsp";
		HttpSession session = req.getSession();
		
		if (session.getAttribute("is_login") != null) {
			boolean is_login = (boolean)session.getAttribute("is_login");
			if (is_login) {
				session.setAttribute("is_login", false);
				req.getRequestDispatcher(view).forward(req, resp);
				resp.sendRedirect("index.shop");
			}
		}
	}

}
