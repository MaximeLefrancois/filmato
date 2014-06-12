package fr.max.filmato.entities;

import java.util.Date;

/**
 * This Class {@link Movie}.
 *
 * @author Maxime LEFRANCOIS <maximelefrancois76@gmail.com>
 */
@Entity
@Table(name = movie)
public class Movie {

    @Id
    @Generated
    private int id;

    private String title;

    private String description;

    private Date exitYear;

    private String note;

    private Kind kind;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getExitYear() {
        return exitYear;
    }

    public String getNote() {
        return note;
    }

    public Kind getKind() {
        return kind;
    }
}
