package action;

public class ShopActionFactory {
	public Action getAction(String actionName) {
		Action action = null;
		
		if (actionName.equals("/index")) action = new IndexAction();
		else if (actionName.equals("/create_item")) action = new CreateItemAction();
		else if (actionName.equals("/signUp")) action = new SignUpAction();
		else if (actionName.equals("/signIn")) action = new SignInAction();
		else if (actionName.equals("/signOut")) action = new SignOutAction();
		
		else if (actionName.equals("/create_item")) action = new CreateItemAction();
		
		return action;
	}
}
