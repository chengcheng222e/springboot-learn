package com.cyblogs.springboot.dao;

import com.cyblogs.springboot.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA
 * <p>
 * User: chenyuan
 */
@Mapper
public interface AccountMapper {

    @Insert("insert into account(name, money) values(#{name}, #{money})")
    int add(@Param("name") String name, @Param("money") double money);

    int deleteByPrimaryKey(Long id);

    int update(@Param("id") Long id, @Param("money") Double money);

    Account selectById(Long id);
}
