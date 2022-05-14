package action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ShopItemDAO;
import model.ShopItemDTO;

public class CreateItemAction implements Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String view = WEB_INF + "create_item_form.jsp";
		if (req.getMethod().equals("GET") ) {
			req.getRequestDispatcher(view).forward(req, resp);
		} else {
			ShopItemDAO dao = new ShopItemDAO();
			ShopItemDTO newItem = new ShopItemDTO();
			newItem.setItem_code( req.getParameter("item_code") );
			newItem.setItem_name( req.getParameter("item_name") );
			newItem.setPrice( Integer.parseInt(req.getParameter("price")) );
			newItem.setColor( req.getParameter("color") );
			newItem.setItem_size( req.getParameter("item_size") );
			newItem.setItem_count( Integer.parseInt(req.getParameter("item_count")) );
			newItem.setCategory( req.getParameter("category") );
			
			
			if (this.isValid(newItem)) {
				if (dao.insert(newItem) != 0) {
					view = WEB_INF + "index.jsp";
					req.getRequestDispatcher(view).forward(req, resp);
				}
			} else {
				req.setAttribute("create_item_success", -1);
				view = WEB_INF + "create_item_form.jsp";
				req.getRequestDispatcher(view).forward(req, resp);
			}
		}
	}
	
	public boolean isValid(ShopItemDTO newItem) {
		if (newItem.getItem_code().equals("") || newItem.getItem_name().equals("") || newItem.getColor().equals("") || newItem.getItem_size().equals("") || newItem.getCategory().equals("") ) {
			return false;
		}
		return true;
	}
}