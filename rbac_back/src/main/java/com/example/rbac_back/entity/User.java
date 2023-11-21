package com.example.rbac_back.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@TableName("sys_user")
public class User implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * ()
     */
    private String username;

    private String password;

    /**
     * (1-0-)
     */
    private boolean isAccountNonExpired = true;

    /**
     * (1-0-)
     */
    private boolean isAccountNonLocked = true;

    /**
     * (1-0-)
     */
    private boolean isCredentialsNonExpired = true;

    /**
     * (1-0-)
     */
    private boolean isEnabled = true;

    private String realName;

    private String nickName;

    /**
     * ID
     */
    private Long departmentId;

    private String departmentName;

    /**
     * (0-1-)
     */
    private Integer gender;

    private String phone;

    private String email;

    private String avatar;

    /**
     * (1-)
     */
    private Integer isAdmin;

    private Date createTime;

    private Date updateTime;

    /**
     * (0-1-)
     */
    private Integer isDelete;

    /**
     * 权限列表
     */
    @TableField(exist = false)
    Collection<? extends GrantedAuthority> authorities;
    /**
     * 查询用户权限列表
     */
    @TableField(exist = false)
    private List<Permission> permissionList;

}
