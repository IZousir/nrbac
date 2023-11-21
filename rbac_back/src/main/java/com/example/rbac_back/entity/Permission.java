package com.example.rbac_back.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@TableName("sys_permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String label;

    /**
     * ID
     */
    private Long parentId;

    private String parentName;

    private String code;

    private String path;

    private String name;

    private String url;

    /**
     * (0- 1- 2-)
     */
    private Integer type;

    private String icon;

    private Date createTime;

    private Date updateTime;

    private String remark;

    private Integer orderNum;

    /**
     * (0-1-)
     */
    private Integer isDelete;

    /**
     * 子菜单列表
     */
    @JsonInclude(JsonInclude.Include.NON_NULL) //属性值为null不进行序列化操作
    @TableField(exist = false)
    private List<Permission> children = new ArrayList<Permission>();
    /**
     * 用于前端判断是菜单、目录或按钮
     */
    @TableField(exist = false)
    private String value;
    /**
     * 是否展开
     */
    @TableField(exist = false)
    private Boolean open;


}
