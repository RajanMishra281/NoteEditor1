package com.note.editor.service;

import com.note.editor.model.User;

public interface UserService {

	User loginUser(String userEmail , String userPassword);
	
	Boolean register(User user);
}
