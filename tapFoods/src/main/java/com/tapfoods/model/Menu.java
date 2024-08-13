package com.tapfoods.model;

public class Menu {
	private int menuId;
	private int restaurantId;
	private String menuName;
	private float Price;
	private String description;
	private String isAvailable;
	private String imgPath;
	
	public Menu() {
		super();
	}

	public Menu(int menuId, int restaurantId, String menuName, float price, String description, String isAvailable,
			String imgPath) {
		super();
		this.menuId = menuId;
		this.restaurantId = restaurantId;
		this.menuName = menuName;
		Price = price;
		this.description = description;
		this.isAvailable = isAvailable;
		this.imgPath = imgPath;
	}

	public Menu(int restaurantId, String menuName, float price, String description, String isAvailable,
			String imgPath) {
		super();
		this.restaurantId = restaurantId;
		this.menuName = menuName;
		Price = price;
		this.description = description;
		this.isAvailable = isAvailable;
		this.imgPath = imgPath;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", restaurantId=" + restaurantId + ", menuName=" + menuName + ", Price="
				+ Price + ", description=" + description + ", isAvailable=" + isAvailable + ", imgPath=" + imgPath
				+ "]";
	}

}
