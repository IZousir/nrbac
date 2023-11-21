package com.example.rbac_back.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.rbac_back.entity.User;
import com.example.rbac_back.dao.UserMapper;
import com.example.rbac_back.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zh zou
 * @since 2023-11-20
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public User findUserByUserName(String userName) {
        //创建条件构造器
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        //用户名
        queryWrapper.eq("username",userName);
        //返回查询记录
        return baseMapper.selectOne(queryWrapper);
    }
}
