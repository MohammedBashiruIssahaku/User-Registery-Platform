package Bashiru.Java.User.Registery.Platform.UserControllers;


import Bashiru.Java.User.Registery.Platform.UserExceptions.userException;
import Bashiru.Java.User.Registery.Platform.UserModel.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/Users")
public class userController
{
    private final List<User> user = new ArrayList<>();


    @GetMapping
    @RequestMapping ("/AllUsers")
    public List<User> getAllUsers()
    {
          return user;
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
