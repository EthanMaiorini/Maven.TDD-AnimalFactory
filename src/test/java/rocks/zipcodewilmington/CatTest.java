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
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setcatNameTest(){
        //given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        //when
        givenName = "Shadow";
        cat.setName(givenName);
        String retrievedName = cat.getName();
        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void speakTest(){
        //given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        //when
        String speak = cat.speak();
        //Then
        Assert.assertEquals("meow!", speak);

    }

    @Test
    public void setBirthdateTest(){
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        Date newBirthdate = new Date(2002,5,15);

        // When
        cat.setBirthDate(newBirthdate);

        // Then
        Date now = cat.getBirthDate();
        Assert.assertEquals(newBirthdate,now);
    }

    @Test
    public void eatTest(){
        //given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        //when
        cat.eat(food);
        //then
        int meals = cat.getNumberOfMealsEaten();
        Assert.assertEquals(meals,1);
    }

    @Test
    public void getIdTest(){
        //given
        int id = 25;
        Cat cat = new Cat(null, null, id);

        //when
        int newId = cat.getId();
        Assert.assertEquals(newId,id);
    }

    @Test
    public void instanceTestMammal(){
        //given

        Cat cat = new Cat(null, null, null);

        //when

        Assert.assertEquals(cat instanceof Mammal,true);
    }

    @Test
    public void instanceTestAnimal(){
        //given

        Cat cat = new Cat(null, null, null);

        //when

        Assert.assertEquals(cat instanceof Animal,true);
    }
}
