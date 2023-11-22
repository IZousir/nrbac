package com.example.rbac_back.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.rbac_back.entity.Department;
import com.example.rbac_back.vo.query.DepartmentQueryVo;
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

public interface DepartmentService extends IService<Department> {

    /**
     * 查询部门列表
     * @param departmentQueryVo
     * @return
     */
    List<Department> findDepartmentList(DepartmentQueryVo departmentQueryVo);
/**
 * 查询上级部门列表
 * @return
 */
    List<Department> findParentDepartment();
    /**
     * 判断部门下是否有子部门
     * @param id
     * @return
     */
    boolean hasChildrenOfDepartment(Long id);
    /**
     * 判断部门下是否存在用户
     * @param id
     * @return
     */
    boolean hasUserOfDepartment(Long id);

}
