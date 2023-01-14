package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.domain.Book;

/**
 * @Mapper 创建代理类
 */
@Mapper
public interface BookDao {

    @Select("select * from tb_book where id = #{id}")
    public Book getById(Integer id);
}
