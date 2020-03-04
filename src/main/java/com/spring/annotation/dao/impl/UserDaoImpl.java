package com.spring.annotation.dao.impl;

import com.spring.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("into DB.....");
    }
}
