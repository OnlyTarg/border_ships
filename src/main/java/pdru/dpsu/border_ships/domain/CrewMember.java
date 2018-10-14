package pdru.dpsu.border_ships.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class CrewMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private BorderShip borderShip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BorderShip getBorderShip() {
        return borderShip;
    }

    public void setBorderShip(BorderShip borderShip) {
        this.borderShip = borderShip;
    }

}