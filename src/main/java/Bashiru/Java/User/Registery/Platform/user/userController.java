package Bashiru.Java.User.Registery.Platform.user;


import Bashiru.Java.User.Registery.Platform.exception.userException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping ("/Users")
public class userController
{
    private userDaoService service;

    private final List<User> user = new ArrayList<>();


    @GetMapping
    @RequestMapping ("/AllUsers")
    public List<User> getAllUsers()
    {
          return service.getAllUsers();
    }

    @GetMapping
    public User getUserById( @PathVariable int joinDate , @PathVariable String password,
                             @PathVariable int id , @PathVariable String name)
    {
        return user.stream()
                .filter(user-> user.getId() == id && user.getName().equals(name) && user.getJoinDate() == joinDate)
                .findFirst()
                .orElseThrow ( () -> new userException("user with id: " + id + "not found") );

    }

    @GetMapping
    public User getUserByName( @PathVariable int joinDate , @PathVariable String password,
                               @PathVariable int id , @PathVariable String name)
    {
        return user.stream()
                .filter(user -> user.getName().equals(name) && user.getId() == id && user.getJoinDate() == joinDate)
                .findFirst()
                .orElseThrow (() -> new userException("user with name: " + name + "not found"));
    }


    @GetMapping
    public User getUserByJoinDate( @PathVariable int joinDate , @PathVariable int id , @PathVariable String name)
    {
        return user.stream()
                .filter(user -> user.getJoinDate() == joinDate && user.getName().equals(name) && user.getId()==id)
                .findFirst()
                .orElseThrow(() -> new userException("user with joinDate: " + joinDate + "Not found"));

    }




}
