package fr.max.filmato.entities;

import java.util.Date;

/**
 * This Class {@link Actor}.
 *
 * @author Maxime LEFRANCOIS <maximelefrancois76@gmail.com>
 */
@Entity
@Table(name = actor)
public class Actor {

    @Id
    @Generated
    private int id;

    private String lastName;

    private String firstName;

    private Date birthdayDate;

    private Date deathDate;

    private String nationality;

    private String Biography;

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getBirthdayDate() {
        return birthdayDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBiography() {
        return Biography;
    }
}
