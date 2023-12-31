package com.example.rbac_back.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zh zou
 * @since 2023-11-20
 */
@Data
@TableName("sys_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String departmentName;

    private String phone;

    private String address;

    private Long pid;

    private String parentName;

    private Integer orderNum;

    /**
     * (0- 1-)
     */
    private Integer isDelete;

    /**
     * 是否展开
     */
    @TableField(exist = false)
    private Boolean open;
    /**
     * 子部门
     */
    @TableField(exist = false)
    private List<Department> children = new ArrayList<Department>();
}
