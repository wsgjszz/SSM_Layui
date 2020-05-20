package cn.dao;

import cn.domain.Anchor;
import cn.domain.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnchorDao {

    @Select("SELECT * FROM anchor")
    @Results(id = "resultMap",value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "uid",property = "uid"),
            @Result(column = "uname",property = "uname"),
            @Result(column = "address",property = "address"),
            @Result(column = "cid",property = "cid"),
            @Result(column = "cid",property = "category",javaType = Category.class,
                    one = @One(select = "cn.dao.CategoryDao.selectById"))
    })
    public List<Anchor> selectAll();

    @Select("SELECT * FROM anchor WHERE id=#{id}")
    @ResultMap(value = "resultMap")
    public Anchor selectOne(Anchor anchor);

    @Update("DELETE FROM anchor WHERE id=#{id}")
    public void delete(Anchor anchor);

    @Insert("INSERT INTO anchor VALUES(NULL,#{nickname},#{uid},#{uname},#{address},#{cid})")
    public void add(Anchor anchor);

    @Update("UPDATE anchor SET nickname=#{nickname},uid=#{uid},uname=#{uname},address=#{address},cid=#{cid} WHERE id=#{id}")
    public void update(Anchor anchor);
}
