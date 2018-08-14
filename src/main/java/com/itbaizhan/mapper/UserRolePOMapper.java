package com.itbaizhan.mapper;

import com.itbaizhan.model.UserRolePO;

public interface UserRolePOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRolePO record);

    int insertSelective(UserRolePO record);

    UserRolePO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRolePO record);

    int updateByPrimaryKey(UserRolePO record);
}