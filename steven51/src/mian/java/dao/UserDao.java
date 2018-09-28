package dao;

import entity.User;

public interface UserDao {
	public boolean regist(User user);
	public boolean update(User user);
	
}
