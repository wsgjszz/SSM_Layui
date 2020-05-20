import cn.dao.CategoryDao;
import cn.domain.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CategoryDaoTest {

    @Test
    public void select() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CategoryDao dao = session.getMapper(CategoryDao.class);
        //执行方法
        List<Category> categories = dao.selectAll();
        for (Category category : categories) {
            System.out.println(category);
        }
        //释放资源
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void add() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CategoryDao dao = session.getMapper(CategoryDao.class);
        //执行方法
        Category category = new Category();
        category.setCname("测试33");
        dao.add(category);
        //释放资源
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void delete() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CategoryDao dao = session.getMapper(CategoryDao.class);
        //执行方法
        Category category = new Category();
        category.setId(6);
        dao.delete(category);
        //释放资源
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void update() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        CategoryDao dao = session.getMapper(CategoryDao.class);
        //执行方法
        Category category = new Category();
        category.setId(4);
        category.setCname("测试4");
        dao.update(category);
        //释放资源
        session.commit();
        session.close();
        in.close();
    }

}
