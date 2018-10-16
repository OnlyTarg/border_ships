package pdru.dpsu.border_ships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pdru.dpsu.border_ships.domain.BorderShip;
import pdru.dpsu.border_ships.repositories.BorderShipRepository;

import java.util.Optional;

@Controller
public class IndexController {
    BorderShipRepository borderShipRepository;

    public IndexController(BorderShipRepository borderShipRepository) {
        this.borderShipRepository = borderShipRepository;
    }

    @RequestMapping({"","/"})
    public String getIndexPage() {
        return "index";
    }
}