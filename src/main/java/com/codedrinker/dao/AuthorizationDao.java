package com.codedrinker.dao;

import com.codedrinker.entity.Authorization;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by codedrinker on 07/07/2017.
 */
public interface AuthorizationDao {
    @Insert("insert into authorization (id,token,website,utime,ctime,status) values (#{id},#{token},#{website},#{ctime},#{utime},#{status});")
    void save(Authorization authorization);

    @Update("update authorization set token=#{token}, utime=#{utime}, website=#{website} where id=#{id}")
    void update(Authorization authorization);

    @Select("select * from authorization where id = #{id}")
    Authorization get(Integer id);

    @Update("update authorization set status=0 where id=#{id}")
    void delete(Integer id);

    @Update("update authorization set status=1 where id=#{id}")
    void active(Integer id);
}
