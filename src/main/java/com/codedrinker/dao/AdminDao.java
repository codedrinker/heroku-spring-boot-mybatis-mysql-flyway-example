package com.codedrinker.dao;

import com.codedrinker.entity.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by codedrinker on 07/07/2017.
 */
public interface AdminDao {
    @Insert("insert into admin (username,password,gmt_created,gmt_modified,status) values (#{username},#{password},#{gmtCreated},#{gmtModified},#{status})")
    @Options(useGeneratedKeys = true)
    Integer insert(Admin admin);

    @Update("update admin set username = #{username}, password = #{password}, gmt_modified = #{gmtModified}, status = #{status} where id = #{id}")
    void update(Admin admin);

    @Select("select * from admin where id = #{id}")
    Admin select(Integer id);

    @Select("select * from admin")
    List<Admin> list();

    @Delete("delete from admin where id = #{id}")
    Integer delete(Integer id);
}
