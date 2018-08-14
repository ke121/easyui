package com.itbaizhan.service;

import com.itbaizhan.model.MenuPO;
import com.itbaizhan.model.UserPO;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);

    UserPO login(UserPO userPO) ;

}
