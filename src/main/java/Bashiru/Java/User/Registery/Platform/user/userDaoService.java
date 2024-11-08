package Bashiru.Java.User.Registery.Platform.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class userDaoService
{

     private static List<User> users = new ArrayList<>();


     public List<User> getAllUsers()
     {
         return users;
     }

     public User save(User user)
     {
           users.add(user);
           return user;
     }

     public User findOne(int id)
     {
         for(User user : users)
         {
             if(user.getId() == id)
             {
                 return user;
             }
         }
         return null;
     }

   public User deleteById( int id)
   {
       Iterator<User> iterator = users.iterator();

       while(iterator.hasNext())
       {
           User user =iterator.next();
           if(user.getId()== id)
           {
                iterator.remove();
                return user;
           }
       }
       return null;
   }

  public User update(int id, User user)
  {
       for(User storedUser: users)
       {
          if(storedUser.getId() == id)
          {
              storedUser.setName(user.getName());
              storedUser.setPassword(user.getPassword());

              return storedUser;
          }
       }
       return null;
  }


}
