package com.itbaizhan.mapper;

import com.itbaizhan.model.MenuPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MenuPO record);

    int insertSelective(MenuPO record);

    MenuPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MenuPO record);

    int updateByPrimaryKey(MenuPO record);

    //根据用户id查询一级菜单
    List<MenuPO> selectMenusByUid(Integer id) ;

    //根据用户id和菜单pid查询二级菜单
    List<MenuPO> selectMenusByPid(@Param("uid") Integer uid , @Param("pid") Integer pid) ;
}