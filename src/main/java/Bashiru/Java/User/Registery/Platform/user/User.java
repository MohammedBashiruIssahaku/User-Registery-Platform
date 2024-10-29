package Bashiru.Java.User.Registery.Platform.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User
{
   private String name;
   private int id;
   private int joinDate;
   private String password;




}
