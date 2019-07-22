package pl.lukasz.demo;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class AnimalRepository {

    private Set<Animal> animals;

    public AnimalRepository() {
        animals = new HashSet<>();
        this.animals = animals;
        animals.add(new Animal ("Azor", "Azor to miły pies"));
        animals.add(new Animal("Rudy", "Rudy to miły pies"));
        animals.add(new Animal("Reksio", "Reksio występuje w filmie"));
    }

    public Animal getAnimal(String name){
        for (Animal animal:animals) {
            if(animal.getName().contains(name)){
                return animal;
            }
        }
        return null;

    }
    public Set<Animal> allAnimals(){
        return animals;
    }
}
