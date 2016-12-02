package service;

import mapper.UserMapper;
import model.User;
import org.apache.ibatis.session.SqlSession;
import util.MyBatisSession;

/**
 * Created by Administrator on 2016/12/2.
 */
public class UserService {
    private static int createUserViaXML(){
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)){
            return sqlSession.insert("Usersmapper.create",new User(null,"user1","password1"));
        }
    }

    private static int createUser() {
        try (SqlSession sqlSession = MyBatisSession.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.create(new User(null, "user2", "password2"));
        }
    }

    public static void main(String[] args){
        System.out.println(createUserViaXML());
//        System.out.println(createUser());
    }
}



