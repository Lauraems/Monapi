package Service;

import Dao.UserRepository;
import Entity.Adresse;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserJpaService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUser() {
        return userRepository.findAllUsers(); }

    public List<String> findUsersByNom() {
        return userRepository.findUsersByNom(); }

    public List<String> findUsersByPrenom() {
        return userRepository.findUsersByPrenom();}

    public List<String> findUsersNomBy3Character() {
        return userRepository.findUsersNomBy3Character();}

    public List<String> findUsersNomByAgeImpair() {
        return findAllUser().stream().filter(u -> u.getAge()%2==1).map(u -> u.getNom()).collect(Collectors.toList());}

    public List<Adresse> findAdresseById() {
        return userRepository.findAdresseById();}

    public List<Adresse> findAllAdresse() {
        return userRepository.findAllAdresse();}


}
