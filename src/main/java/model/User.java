package model;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/12/2.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;

    public User(){}

    public User(Integer id,String username,String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }


    public void setId(Integer id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Integer getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}


// get方法有返回值无参；set方法有参无返回值。