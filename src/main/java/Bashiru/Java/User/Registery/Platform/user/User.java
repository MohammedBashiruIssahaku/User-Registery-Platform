package Bashiru.Java.User.Registery.Platform.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class User
{
   @Id
   @GeneratedValue

   private String name;
   private int id;
   private int joinDate;
   private String password;




}
