package com.example.rbac_back.service.impl;

import com.example.rbac_back.entity.Department;
import com.example.rbac_back.dao.DepartmentMapper;
import com.example.rbac_back.service.DepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
