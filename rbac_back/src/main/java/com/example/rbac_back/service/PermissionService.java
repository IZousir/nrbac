package com.example.rbac_back.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.rbac_back.entity.Permission;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zh zou
 * @since 2023-11-20
 */

public interface PermissionService extends IService<Permission> {
    /**
     * 根据用户ID查询权限列表
     * @param userId
     * @return
     */
    List<Permission> findPermissionListByUserId(Long userId);

}
