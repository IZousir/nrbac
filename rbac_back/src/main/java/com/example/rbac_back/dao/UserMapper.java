package com.example.rbac_back.dao;

import com.example.rbac_back.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zh zou
 * @since 2023-11-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
