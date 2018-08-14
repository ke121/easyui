package com.itbaizhan.mapper;

import com.itbaizhan.model.MenuRolePO;

public interface MenuRolePOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuRolePO record);

    int insertSelective(MenuRolePO record);

    MenuRolePO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuRolePO record);

    int updateByPrimaryKey(MenuRolePO record);
}