package com.example.herokuhostionsprint1.mappres.impl;


import com.example.herokuhostionsprint1.dtos.UserDto;
import com.example.herokuhostionsprint1.entities.User;
import com.example.herokuhostionsprint1.mappres.IUserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserMapperImpl implements IUserMapper {

    @Override
    public UserDto fromUser(User user){
        UserDto userDto=new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return  userDto;
    }

    @Override
    public User fromUserDto(UserDto userDto){
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        return  user;
    }
}
