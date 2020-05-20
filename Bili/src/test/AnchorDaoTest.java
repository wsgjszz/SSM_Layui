import cn.dao.AnchorDao;
import cn.dao.CategoryDao;
import cn.domain.Anchor;
import cn.domain.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class AnchorDaoTest {

    @Test
    public void select() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AnchorDao dao = session.getMapper(AnchorDao.class);
        //执行方法
        List<Anchor> anchors = dao.selectAll();
        System.out.println(anchors);
        //释放资源
        session.commit();
        session.close();
        in.close();
    }

    @Test
    public void selectOne() throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        AnchorDao dao = session.getMapper(AnchorDao.class);
        //执行方法
        Anchor anchor = new Anchor();
        anchor.setId(2);
        Anchor anchorr = dao.selectOne(anchor);
        System.out.println(anchorr);
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
        AnchorDao dao = session.getMapper(AnchorDao.class);
        //执行方法
        Anchor anchor = new Anchor();
        anchor.setNickname("测试");
        anchor.setAddress("测试");
        anchor.setUname("测试");
        anchor.setUid(1000);
        dao.add(anchor);
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
        AnchorDao dao = session.getMapper(AnchorDao.class);
        //执行方法
        Anchor anchor = new Anchor();
        anchor.setId(3);
        dao.delete(anchor);
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
        AnchorDao dao = session.getMapper(AnchorDao.class);
        //执行方法
        Anchor anchor = new Anchor();
        anchor.setId(3);
        anchor.setNickname("测试2");
        anchor.setAddress("测试2");
        anchor.setUname("测试2");
        anchor.setUid(10002);
        dao.update(anchor);
        //释放资源
        session.commit();
        session.close();
        in.close();
    }

}
