package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Luna";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }



    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    @Test
    public void speakTest(){
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);

        //when
        String speak = dog.speak();
        //Then
        Assert.assertEquals("bark!", speak);
    }

    @Test
    public void setBirthdateTest(){
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date newBirthdate = new Date(2000,10,12);

        // When
        dog.setBirthDate(newBirthdate);

        // Then
        Date now = dog.getBirthDate();
        Assert.assertEquals(newBirthdate,now);
    }

    @Test
    public void eatTest(){
        //given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        //when
        dog.eat(food);
        //then
        int meals = dog.getNumberOfMealsEaten();
        Assert.assertEquals(meals,1);
    }

    @Test
    public void getIdTest(){
        //given
        Integer id = 25;
        Dog dog = new Dog(null, null, id);

        //when

        //Then
        Integer newId = dog.getId();
        Assert.assertEquals(newId,id);
    }

    @Test
    public void instanceTestMammal(){
        //given

        Dog dog = new Dog(null, null, null);

        //when

        Assert.assertEquals(dog instanceof Mammal,true);
    }

    @Test
    public void instanceTestAnimal(){
        //given

        Dog dog = new Dog(null, null, null);

        //when

        Assert.assertEquals(dog instanceof Animal,true);
    }

}
