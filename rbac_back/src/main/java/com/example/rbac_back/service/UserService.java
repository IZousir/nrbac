package com.example.rbac_back.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.rbac_back.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zh zou
 * @since 2023-11-20
 */

public interface UserService extends IService<User> {
    User findUserByUserName(String name);
}
