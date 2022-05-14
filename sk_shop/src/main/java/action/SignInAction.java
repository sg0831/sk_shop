package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ShopUserDAO;
import model.ShopUserDTO;

public class SignInAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String view = WEB_INF + "signIn.jsp";
		if (req.getMethod().equals("GET") ) {
			req.getRequestDispatcher(view).forward(req, resp);
		} else {
			if (this.checkUser(req, resp)) {
				view = WEB_INF + "index.jsp";
				req.setAttribute("login_success", 1);
				req.getSession().setAttribute("is_login", true);
				req.getRequestDispatcher(view).forward(req, resp);
				resp.sendRedirect("index.shop");
			} else {
				req.setAttribute("login_success", -1);
				req.getRequestDispatcher(view).forward(req, resp);
			}
		}
		
	}
	
	private boolean checkUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_id = req.getParameter("user_id");
		String user_pw = req.getParameter("user_pw");
		
		
		ShopUserDAO dao = new ShopUserDAO();
		ShopUserDTO selectedUser = dao.selectOne(user_id);
		
		if (selectedUser != null) {
			if (selectedUser.getUser_pw().equals(user_pw)) {
				return true;
			}
		}
		
		return false;
	}

}
