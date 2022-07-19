package com.example.herokuhostionsprint1.services;



import com.example.herokuhostionsprint1.dtos.UserDto;
import com.example.herokuhostionsprint1.exceptions.UserNotFoundException;

import java.util.List;

public interface IAdminService {

    UserDto saveUser(UserDto userDto);

    List<UserDto> listUsers();

    UserDto getUser(Long userId) throws UserNotFoundException;

    UserDto updateUser(UserDto userDto);

    void deleteUser(Long userId);

    List<UserDto> searchUsers(String keyword);
}
