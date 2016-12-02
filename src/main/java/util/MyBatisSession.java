package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by Administrator on 2016/12/2.
 */
public class MyBatisSession {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSessionFactory getSqlSessionFactory(){
        //构造此方法以通过xml配置文件完成数据库连接、会话等一系列操作
        //因此，这个强大的类被尊称为“Sql会话工厂”。
        if (sqlSessionFactory == null) {
            try {
                sqlSessionFactory = new SqlSessionFactoryBuilder().
                        build(Resources.getResourceAsStream("mybatis-config.xml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }
    public static SqlSession getSqlSession(boolean autoCommit){
        // 当参数为true时，相当于开启了一次与sql的会话。
        return getSqlSessionFactory().openSession(autoCommit);
    }
}
