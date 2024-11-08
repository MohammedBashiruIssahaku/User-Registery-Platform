package Bashiru.Java.User.Registery.Platform.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userJpaController extends JpaRepository<User, Long>
{

}
