package cn.dao;

import cn.domain.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {

    @Select("select * from category")
    public List<Category> selectAll();

    @Select("select * from category where id=#{id}")
    public List<Category> selectById(Integer id);

    @Insert("INSERT INTO category VALUES(NULL,#{cname})")
    public void add(Category category);

    @Update("DELETE FROM category WHERE id=#{id}")
    public void delete(Category category);

    @Update("UPDATE category SET cname=#{cname} WHERE id=#{id}")
    public void update(Category category);
}
