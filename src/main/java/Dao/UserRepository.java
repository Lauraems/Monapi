package Dao;

import Entity.Adresse;
import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u")
    public List<User> findAllUsers();

    @Query("select u.nom from User u")
    List<String> findUsersByNom();

    @Query("select u.prenom from User u")
    List<String> findUsersByPrenom();

    @Query("select u.nom from User u")
    List<String> findUsersNomBy3Character();

    @Query("select u.nom from User u")
    List<String> findUsersNomByAgeImpair();

    @Query("select u from Adresse u")
    List<Adresse> findAllAdresse();

    @Query("select u from Adresse u")
    List<Adresse> findAdresseById();
}
