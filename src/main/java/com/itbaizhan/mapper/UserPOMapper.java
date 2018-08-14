package com.itbaizhan.mapper;

import com.itbaizhan.model.MenuPO;
import com.itbaizhan.model.UserPO;
import org.springframework.stereotype.Repository;


public interface UserPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);

    UserPO selectByUserName(String userName) ;


}