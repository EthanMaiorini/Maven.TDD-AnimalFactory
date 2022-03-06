package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest() {
        // Given (dog data)
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        Integer id = animal.getId();
        DogHouse.clear();

        // When (a dog is constructed)
        Dog dog = new Dog(name, birthDate,id);

        // When (we retrieve data from the cat)
        String retrievedName = animal.getName();
        Date retrievedBirthDate = animal.getBirthDate();
        Integer retrievedId = animal.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(retrievedName, name);
        Assert.assertEquals(retrievedBirthDate, birthDate);
        Assert.assertEquals(retrievedId, id);

    }

    @Test
    public void createCatTest() {
        // Given (dog data)
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        Integer id = animal.getId();
        CatHouse.clear();

        // When (a dog is constructed)
        Cat cat = new Cat(name, birthDate,id);

        // When (we retrieve data from the cat)
        String retrievedName = animal.getName();
        Date retrievedBirthDate = animal.getBirthDate();
        Integer retrievedId = animal.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(retrievedName, name);
        Assert.assertEquals(retrievedBirthDate, birthDate);
        Assert.assertEquals(retrievedId, id);

    }

}
