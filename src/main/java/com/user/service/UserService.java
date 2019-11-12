package com.user.service;

import com.user.pojo.Usertable;

import java.util.List;

public interface UserService {

    List<Usertable> login(Usertable usertable);

    List<Usertable> showList();

    Usertable selectById(Integer ucode);

    void deleteById(Integer ucode);

    void update(Usertable usertable);

    void insert(Usertable usertable);

}
