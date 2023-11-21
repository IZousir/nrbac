package com.example.rbac_back.service.impl;

import com.example.rbac_back.entity.Role;
import com.example.rbac_back.dao.RoleMapper;
import com.example.rbac_back.service.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
