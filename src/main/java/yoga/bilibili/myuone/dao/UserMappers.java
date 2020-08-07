package yoga.bilibili.myuone.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import yoga.bilibili.myuone.model.User;


public interface UserMappers {
    User oneSelect(@Param("userid") int userid);
}
