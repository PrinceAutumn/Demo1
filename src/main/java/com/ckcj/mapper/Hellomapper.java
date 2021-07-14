package com.ckcj.mapper;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Repository;


@Repository
    public interface Hellomapper {
        //public User findUser(User user);
        public User findUser (@Param(value = "username" )String uname,
                              @Param(value = "upwd" )String upwd);

        //public User findUser(HashMap hashMap);
    }


