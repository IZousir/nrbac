package com.example.rbac_back.service.impl;

import com.example.rbac_back.entity.Permission;
import com.example.rbac_back.dao.PermissionMapper;
import com.example.rbac_back.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
    /**
     * 根据用户ID查询权限列表
     *
     * @param userId
     * @return
     */
    @Override
    public List<Permission> findPermissionListByUserId(Long userId) {
        return baseMapper.findPermissionListByUserId(userId);
    }

}
