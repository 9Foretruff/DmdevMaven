package com.foretruff.service.service;

import com.foretruff.database.dao.UserDao;
import com.foretruff.service.dto.UserDto;

import java.util.Optional;

public class UserService {
    private static final UserService INSTANCE = new UserService();
    private final UserDao userDao = new UserDao();

    public static UserService getInstance() {
        return INSTANCE;
    }

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(userDto -> new UserDto());
    }

}