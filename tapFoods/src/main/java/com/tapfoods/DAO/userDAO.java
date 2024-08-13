package com.tapfoods.DAO;

import java.util.List;

import com.tapfoods.model.User;

public interface userDAO {
	
	int insertUser(User u);
	int deleteUser(int userId);
	List <User> fetchAll();
	User fetchUser(int userId);
	int UpdateOnAddress(int userId);
	

}
