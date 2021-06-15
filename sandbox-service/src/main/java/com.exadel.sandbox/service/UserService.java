package com.exadel.sandbox.service;

import com.exadel.sandbox.dto.request.UserDto;
import com.exadel.sandbox.model.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<UserDto> findAll();

    UserDto findByName(final String name);

}
