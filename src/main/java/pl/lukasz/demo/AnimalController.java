package pl.lukasz.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class AnimalController {

   private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    public String displayAnimals(Model model){
        Set<Animal> animals = animalRepository.allAnimals();
        model.addAttribute("animals", animals);
        return "index";
    }

    @GetMapping("/zwierzak")
    public String getAnimal(Model model, @RequestParam String imie){
        Animal animal = animalRepository.getAnimal(imie);
    model.addAttribute("zwierzak", animal);
    return "zwierzak";
    }

}
