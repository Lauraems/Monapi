package Controller;

import Entity.User;
import Service.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserTestJpaController {

    @Autowired
    UserJpaService userJpaService;

    @GetMapping(path = "/allUser",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> findAllUser() {
        return userJpaService.findAllUser();

    }

    @GetMapping(path = "/allUser/{age}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> findAllUser(@PathVariable(value = "age")int age) {
        return userJpaService.findUserByAgeMoreThanX(age);

    }
}
