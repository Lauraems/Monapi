package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    //@Column(name = "nom")
    private String nom, prenom, ville;
    private int age;
    private String email;
    private String role;

    public User () {  }

    public User(Long idUser, String nom, String prenom, String ville, int age, String email, String role) {
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.age = age;
        this.email = email;
        this.role = role;
    }
}
