package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testadd() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int dogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(dogs,1);
    }

    @Test
    public void testremove() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        name = "Luna";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal2);
        int dogId = animal2.getId();
        DogHouse.remove(dogId);
        // Then
        int dogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(dogs,1);
    }

    @Test
    public void testremove2() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        name = "Luna";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal2);
        DogHouse.remove(animal2);
        // Then
        int dogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(dogs,1);
    }

    @Test
    public void testGetDogById() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        name = "Luna";
        birthDate = new Date();
        Dog animal2 = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.add(animal2);
        // Then
        Dog dog = DogHouse.getDogById(animal2.getId());
        Assert.assertEquals(dog.getId(),animal2.getId());
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int dogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(dogs,1);
    }
}
