package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ShopUserDAO;
import model.ShopUserDTO;

public class SignUpAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String view = WEB_INF + "signUp.jsp";
		if (req.getMethod().equals("GET") ) {
			req.getRequestDispatcher(view).forward(req, resp);
		} else {
			ShopUserDAO dao = new ShopUserDAO();
			ShopUserDTO newUser = new ShopUserDTO();
			newUser.setUser_id( req.getParameter("user_id") );
			newUser.setUser_pw( req.getParameter("user_pw") );
			newUser.setUser_name( req.getParameter("user_pw") );
			newUser.setEmail( req.getParameter("email") );
			newUser.setPhone_number( req.getParameter("phone_number") );
			newUser.setAddress( req.getParameter("address") );
			
			
			if (this.isValid(newUser)) {
				if (dao.insert(newUser) != 0) {
					view = WEB_INF + "signIn.jsp";
					req.setAttribute("signUp_success", 1);
					req.getRequestDispatcher(view).forward(req, resp);
				}
			} else {
				req.setAttribute("signUp_success", -1);
				view = WEB_INF + "signUp.jsp";
				req.getRequestDispatcher(view).forward(req, resp);
			}
		}
	}
	
	public boolean isValid(ShopUserDTO newUser) {
		if (newUser.getUser_id().equals("") || newUser.getUser_pw().equals("") || newUser.getUser_name().equals("") || newUser.getEmail().equals("") || newUser.getPhone_number().equals("") || newUser.getAddress().equals("")) {
			return false;
		}
		return true;
	}
	
}