package com.ly.controller;

import com.ly.service.ManagerService;
import com.ly.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping("/register")
    String register(){
        return "/manager";
    }
    @RequestMapping("/index")
    String index(){
        return "/index";
    }

    @RequestMapping("/register/manager")
    @ResponseBody
    String judgeRegister(@Valid UserVo userVo, BindingResult bindingResult){
       boolean status =  managerService.register(userVo);
            if(status){
                return "success";
            }
            return "fail";
    }


}
