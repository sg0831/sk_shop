package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ShopActionFactory;

public class ShopFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form을 통해 넘어온 바이너리 데이터가 한글일 수도 있으므로 utf-8 인코딩 처리
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		String commandPath = this.getCommandPath(req);
		ShopActionFactory shopActionFactory = new ShopActionFactory();
		Action action = shopActionFactory.getAction(commandPath);
		action.execute(req, resp);
	}
	
	private String getCommandPath(HttpServletRequest req) {
		// 전체 경로
			String uri = req.getRequestURI();
			String commandPath = null;
			int start_index = req.getContextPath().length();
			int end_index = uri.length()-1;
			
			end_index = uri.indexOf(".");
			
			if (end_index != -1) {
				commandPath = uri.substring(start_index, end_index);
			}
			
			return commandPath;
	}
	
}
