package yoga.bilibili.myuone.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component

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

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
