package pdru.dpsu.border_ships.domain;

import javax.persistence.*;

@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    private BorderShip borderShip;

    @Lob
    private String borderShipNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BorderShip getBorderShip() {
        return borderShip;
    }

    public void setBorderShip(BorderShip borderShip) {
        this.borderShip = borderShip;
    }

    public String getBorderShipNotes() {
        return borderShipNotes;
    }

    public void setBorderShipNotes(String borderShipNotes) {
        this.borderShipNotes = borderShipNotes;
    }
}