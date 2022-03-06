package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testadd() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }

    @Test
    public void testremove() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        name = "Luna";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal2);
        CatHouse.remove(animal2.getId());
        // Then
        int cat = CatHouse.getNumberOfCats();
        Assert.assertEquals(cat,1);
    }

    @Test
    public void testremove2() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        name = "Luna";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal2);
        CatHouse.remove(animal2);
        // Then
        int cats = CatHouse.getNumberOfCats();
        Assert.assertEquals(cats,1);
    }

    @Test
    public void testGetcatById() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        name = "Luna";
        birthDate = new Date();
        Cat animal2 = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.add(animal2);
        // Then
        Cat cat = CatHouse.getCatById(animal2.getId());
        Assert.assertEquals(cat.getId(),animal2.getId());
    }

    @Test
    public void testGetNumberOfcats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        int cats = CatHouse.getNumberOfCats();
        Assert.assertEquals(cats,1);
    }

}
