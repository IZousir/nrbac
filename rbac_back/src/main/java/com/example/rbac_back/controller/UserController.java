package com.example.rbac_back.controller;


import com.example.rbac_back.service.UserService;
import com.example.rbac_back.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zh zou
 * @since 2023-11-20
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/listAll")
    public Result listAll(){
        return Result.ok(userService.list());
    }

}

