package pdru.dpsu.border_ships.repositories;

import org.springframework.data.repository.CrudRepository;
import pdru.dpsu.border_ships.domain.BorderShip;

import java.util.Optional;

public interface BorderShipRepository extends CrudRepository<BorderShip,Long>{
    Optional<BorderShip> findBorderShipByLehght(int lenght);
    Optional<BorderShip> findBorderShipByShipName(String shipName);
}