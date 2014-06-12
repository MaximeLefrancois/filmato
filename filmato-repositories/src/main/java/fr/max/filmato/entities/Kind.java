package fr.max.filmato.entities;

/**
 * This Class {@link Kind}.
 *
 * @author Maxime LEFRANCOIS <maximelefrancois76@gmail.com>
 */
@Entity
@Table(name = kind)
public class Kind {

    @Id
    @Generated
    private int id;

    private String designation;

    private String description;

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDescription() {
        return description;
    }
}
