package com.itbaizhan.service.impl;

import com.itbaizhan.mapper.MenuPOMapper;
import com.itbaizhan.model.MenuPO;
import com.itbaizhan.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuPOMapper mapper ;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(MenuPO record) {
        return 0;
    }

    public int insertSelective(MenuPO record) {
        return 0;
    }

    public MenuPO selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(MenuPO record) {
        return 0;
    }

    public int updateByPrimaryKey(MenuPO record) {
        return 0;
    }

    public List<MenuPO> selectMenusByUid(Integer id) {
        return mapper.selectMenusByUid(id);
    }

    public List<MenuPO> selectMenusByPid(Integer uid, Integer pid) {
        return mapper.selectMenusByPid(uid, pid);
    }
}
