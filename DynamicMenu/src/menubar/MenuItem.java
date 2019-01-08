package menubar;

public class MenuItem {

	//POJO class - have a default constructor, a parametrised constuctor, getters and setters and the toString method
	
	String menuItemName;
	String menuItemLink;

	
	
	public MenuItem() {
	 //default constructor
	}



	public MenuItem(String menuItemName, String menuItemLink) {
		//parameterised constructor
		super();
		this.menuItemName = menuItemName;
		this.menuItemLink = menuItemLink;
		
	}



	public String getMenuItemName() {
		return menuItemName;
	}



	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}



	public String getMenuItemLink() {
		return menuItemLink;
	}



	public void setMenuItemLink(String menuItemLink) {
		this.menuItemLink = menuItemLink;
	}



	@Override
	public String toString() {
		return "MenuItem [menuItemName=" + menuItemName + ", menuItemLink=" + menuItemLink + "]";
	}
	
	
	
	
	
}
