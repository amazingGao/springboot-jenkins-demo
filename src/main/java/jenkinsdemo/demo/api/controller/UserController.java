package jenkinsdemo.demo.api.controller;

import jenkinsdemo.demo.api.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ghd-alem
 * @description
 * @date 2020/6/23 18:01
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/getUserInfo")
    public User getUserInfo(){
        User user = new User();
        user.setAge(12);
        user.setEmail("15151@qq.com");
        user.setId("joihsidi1");
        user.setUsername("小红");
        return user;
    }

}
