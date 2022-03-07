package Service;

import Dao.UserRepository;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserJpaService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUser() {
        return userRepository.donnerTousLesUser(); }

    public List<User> findUserByAgeMoreThanX(int age) {
        return userRepository.donnerTousLesUserSelonLage(age);
    }
}
