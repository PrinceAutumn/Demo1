package com.ckcj.service;


import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("helloService")
public class HelloServiceImpl<HelloMapper, Hello, Myresult> implements HelloService {
    @Autowired
    private HelloMapper helloMapper;

    @Override
    public User login(String uname, String pwd) {
        return null;
    }

    @Override
    public User Login(String uname, String pwd) {
        return null;
    }

}
