package com.codedrinker.dao;

import com.codedrinker.entity.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by codedrinker on 07/07/2017.
 */
public interface AdminDao {
    @Insert("insert into admin (username,password,gmt_created,gmt_modified,status) values (#{username},#{password},#{gmtCreated,#{gmtModified,status}})")
    Admin insert(Admin admin);

    @Update("update admin set username = #{username}, password = #{password}, gmt_modified = #{modified},status = #{status} where id = #{id}")
    Admin update(Admin admin);

    @Select("select * from admin where id = #{id}")
    Admin select(Integer id);

    @Select("select * from admin")
    List<Admin> list();

    @Delete("delete from admin where id = #{id}")
    Integer delete(Integer id);
}
