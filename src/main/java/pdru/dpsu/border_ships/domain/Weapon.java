package pdru.dpsu.border_ships.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;

    @ManyToMany(mappedBy = "weapons" )
    private Set<BorderShip> borderShips;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BorderShip> getBorderShips() {
        return borderShips;
    }

    public void setBorderShips(Set<BorderShip> borderShips) {
        this.borderShips = borderShips;
    }
}