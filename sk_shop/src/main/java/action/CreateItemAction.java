package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateItemAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	if (req.getMethod().equals("POST")) this.doPost(req, resp);
	else this.doGet(req, resp);
	}
	
	private void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String view = WEB_INF+"create_item_form.jsp";
		req.getRequestDispatcher(view).forward(req, resp);
	}
	
	private void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("create item ! " + req.getParameter("user_id"));
		String redirectPath = "/index";
		resp.sendRedirect(redirectPath);
	}

}
