package Bashiru.Java.User.Registery.Platform.UserModel;

public class User
{
   private String name;
   private int id;
   private int joinDate;
   private String password;

   public User(String name, int id , int joinDate, String password)
   {
       this.name = name;
       this.id = id;
       this.joinDate = joinDate;
       this.password = password;
   }

   public String getName()
   {
       return name;
   }

   public void setName(String name)
   {
       this.name = name;
   }

   public int getId()
   {
       return id;
   }

   public void setId(int id)
   {
       this.id = id;
   }

    public int getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(int joinDate) {
        this.joinDate = joinDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
