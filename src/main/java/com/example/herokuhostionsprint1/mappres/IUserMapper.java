package com.example.herokuhostionsprint1.mappres;


import com.example.herokuhostionsprint1.dtos.UserDto;
import com.example.herokuhostionsprint1.entities.User;

public interface IUserMapper {
    UserDto fromUser(User user);

    User fromUserDto(UserDto userDto);
}
