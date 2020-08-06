package yoga.bilibili.myuone.model;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private Integer age;
    public String getUserName(){
        return userName;
    }
    public int getAge(){
        return age;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setAge(int age){
        this.age = age;
    }
}
