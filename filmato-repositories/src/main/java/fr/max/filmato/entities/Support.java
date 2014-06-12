package fr.max.filmato.entities;

/**
 * This Class {@link Support}.
 *
 * @author Maxime LEFRANCOIS <maximelefrancois76@gmail.com>
 */
@Entity
@Table(name = director)
public class Support {

    @Id
    private int code;

    private String type;

    public int getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
}
