package pdru.dpsu.border_ships.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class BorderShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String shipName;
    private Integer width;
    private Integer lehght;
    private Integer maxSpeed;
    private String draft;
    private String project;
    private String history;

    @Lob
    private Byte[] image;

    @Enumerated(value = EnumType.STRING)
    Rank rank;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "borderShip")
    private Set<CrewMember> crewMembers;

    @ManyToMany
    @JoinTable(name = "borderShip_weapon",
    joinColumns = @JoinColumn(name = "borderShip_id"),inverseJoinColumns = @JoinColumn(name="weapon_id"))
    private Set<Weapon>weapons;


    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public Set<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(Set<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLehght() {
        return lehght;
    }

    public void setLehght(Integer lehght) {
        this.lehght = lehght;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDraft() {
        return draft;
    }

    public void setDraft(String draft) {
        this.draft = draft;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Set<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(Set<Weapon> weapons) {
        this.weapons = weapons;
    }
}