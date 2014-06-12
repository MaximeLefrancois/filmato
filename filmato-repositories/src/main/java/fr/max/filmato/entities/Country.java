package fr.max.filmato.entities;

/**
 * This Class {@link Country}.
 *
 * @author Maxime LEFRANCOIS <maximelefrancois76@gmail.com>
 */
@Entity
@Table(name = country)
public class Country {

    @Id
    private int code;

    private String name;

    private String language;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }
}
