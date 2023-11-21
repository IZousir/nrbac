package com.example.rbac_back.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

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
@TableName("sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String roleCode;

    private String roleName;

    private Long createUser;

    private Date createTime;

    private Date updateTime;

    private String remark;

    /**
     * (0-1-)
     */
    private Integer isDelete;


}
