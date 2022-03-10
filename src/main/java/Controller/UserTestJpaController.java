package Controller;

import Entity.Adresse;
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

    @GetMapping(path = "/allUsers",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> findAllUsers() {
        return userJpaService.findAllUser();

    }

    @GetMapping(path = "/allUsers/{name}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> findUsersByNom(@PathVariable String nom) {
        return userJpaService.findUsersByNom();
    }

    @GetMapping(path = "/allUsers/{vorname}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> findUsersByPrenom(@PathVariable String prenom) {
        return userJpaService.findUsersByPrenom();
    }

    @GetMapping(path = "/allUsers/{nameWith3Character}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> findUsersNomBy3Character(@PathVariable String nameWith3Character) {
        return userJpaService.findUsersNomBy3Character();
    }

    @GetMapping(path = "/allUsers/{AgeImpair}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String> findUsersNomByAgeImpair(@PathVariable String AgeImpair){
        return userJpaService.findUsersNomByAgeImpair();
    }

    @GetMapping(path = "/address",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Adresse> findUsersAdresse() {
        return userJpaService.findAllAdresse();
    }

    @GetMapping(path = "/usersId/address",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Adresse> getFindAdresseById() {
        return userJpaService.findAdresseById();
    }


}