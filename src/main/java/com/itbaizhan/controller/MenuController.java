package com.itbaizhan.controller;

import com.itbaizhan.model.MenuPO;
import com.itbaizhan.model.UserPO;
import com.itbaizhan.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService ;
    @PostMapping("/queryMenus")
    public List<MenuPO> queryMenus(HttpSession session){
        UserPO user = (UserPO) session.getAttribute("login");
        return menuService.selectMenusByUid(user.getId()) ;
    }
    @RequestMapping("/queryMenus2")
    public ModelAndView queryMenus2(HttpSession session, Integer pid){
        UserPO user = (UserPO) session.getAttribute("login");
        ModelAndView model = new ModelAndView() ;
        model.addObject("menus", menuService.selectMenusByPid(user.getId(),pid )) ;
        model.setViewName("menus");
         return model ;
    }
}
