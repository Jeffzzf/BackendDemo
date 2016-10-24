package com.jeffzzf.basic.dao;

import com.jeffzzf.basic.po.UserPO;
import org.apache.ibatis.annotations.Param;

public interface UserDAO {
    int addUser(UserPO userPO);
    UserPO getUserById(@Param("id")int id);
}
