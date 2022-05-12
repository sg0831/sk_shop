package action;

public class ShopActionFactory {
	public Action getAction(String actionName) {
		Action action = null;
		
		if (actionName.equals("/index")) action = new IndexAction();
		else if (actionName.equals("/create_item")) action = new CreateItemAction();
		
		return action;
	}
}
