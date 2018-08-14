package com.itbaizhan.service.impl;

import com.itbaizhan.mapper.MenuPOMapper;
import com.itbaizhan.mapper.UserPOMapper;
import com.itbaizhan.model.MenuPO;
import com.itbaizhan.model.UserPO;
import com.itbaizhan.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserPOMapper mapper;
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(UserPO record) {
        return 0;
    }

    public int insertSelective(UserPO record) {
        return 0;
    }

    public UserPO selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(UserPO record) {
        return 0;
    }

    public int updateByPrimaryKey(UserPO record) {
        return 0;
    }

    public UserPO login(UserPO userPO) {
        UserPO user = mapper.selectByUserName(userPO.getUsername());
        if(user == null){
            System.out.println("用户不存在");
            return null ;
        }else {
            String password = userPO.getPassword();
            System.out.println(DigestUtils.md5Hex(password));
            if(DigestUtils.md5Hex(password).equals(user.getPassword())){
                return  user ;
            }
        }
        System.out.println("密码错误");
        return null ;
    }
}
