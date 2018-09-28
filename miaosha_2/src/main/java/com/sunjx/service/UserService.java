package com.sunjx.service;

import com.sunjx.dao.UserDao;
import com.sunjx.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public User getById(int id) {
		 return userDao.getById(id);
	}

	@Transactional //如果是同一事务中 异常之后会回滚整个事务异常前的操作
	public boolean tx() {
		User u1= new User();
		u1.setId(2);
		u1.setName("2222");
		userDao.insert(u1);
		
		User u2= new User();
		u2.setId(1);
		u2.setName("11111");
		userDao.insert(u2);
		
		return true;
	}
	
}
