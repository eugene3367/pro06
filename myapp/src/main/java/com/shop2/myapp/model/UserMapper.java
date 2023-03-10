package com.shop2.myapp.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shop2.myapp.dto.UserDTO;

@Mapper
public interface UserMapper {
	public List<UserDTO> userList() throws Exception;
	public UserDTO getUser(String id) throws Exception;
	public UserDTO getLogin(String id, String pw) throws Exception;
	public void addUser(UserDTO user) throws Exception;


}
