package Entity;

import javax.persistence.*;

@Entity


public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String strasse;
    private int nummer;

    public Adresse() { }

    public Adresse(int id, String strasse, int nummer) {
        this.id = id;
        this.strasse = strasse;
        this.nummer = nummer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }
}
