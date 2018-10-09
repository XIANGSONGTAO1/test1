package dao;

import entity.User;
import util.DBconn;

public class UserDaoImpl implements UserDao{

	public boolean regist(User user) {
		int i = 0;
		DBconn.init();
		String sql= "insert into user(id,name) values('"+user.getId()+"','"+user.getName()+"')";
		
		i=DBconn.update(sql);
		return i==0?false:true;
		
	}

	public boolean update(User user) {
		DBconn.init();
		int i= 0;
		String sql = "update user set name=+"+user.getName()+"where id="+user.getId();
		i=DBconn.update(sql);
		// TODO Auto-generated method stub
		return i==0?false:true;
	}

}
