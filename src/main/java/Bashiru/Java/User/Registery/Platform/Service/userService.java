package Bashiru.Java.User.Registery.Platform.Service;

import Bashiru.Java.User.Registery.Platform.Repository.userRepository;
import Bashiru.Java.User.Registery.Platform.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService
{
    @Autowired
    private userRepository repository;


    public List<User> getAllUsers()
    {
        return repository.findAll();
    }


}
