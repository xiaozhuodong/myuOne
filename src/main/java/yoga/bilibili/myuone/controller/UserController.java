package yoga.bilibili.myuone.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import yoga.bilibili.myuone.dao.UserMappers;
import yoga.bilibili.myuone.model.User;
import yoga.bilibili.myuone.service.AsyService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Api(value = "用户",tags = {"用户操作接口"})
@Slf4j
public class UserController {

    @Resource
    private UserMappers userMappers;
    @GetMapping("/usergo")
    @ApiOperation("用户信息")
    @ResponseBody
    public User oneSelect(@ApiParam("用户id") @RequestParam(defaultValue = "1")int userid){
        log.info("gogo");
        User user = new User();
        user.setUserName("张三");
        user.setAge(12);
        User user1 = userMappers.oneSelect(userid);
        System.out.println(user1.toString());
        return user1;
    }

    @Resource
    private AsyService asyService;
    @RequestMapping(value = "/asyService",method = RequestMethod.GET)
    @ResponseBody
    public String asyService(){
        asyService.executAsy();
        return  "success";
    }
}
