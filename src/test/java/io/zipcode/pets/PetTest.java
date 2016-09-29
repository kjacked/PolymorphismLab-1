package io.zipcode.pets;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;


public class PetTest {


    Pet pet1 = new Dog("Jake");
    Pet pet2 = new Cat("Tom");
    Pet pet3  = new Fish("Nemo");
    Pet pet4 = new Fish("Dory");
    List<Pet> petList = new ArrayList<Pet>();
    HashMap<String, String> Pets = new HashMap<>();

    @Before
    public void setup(){
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        petList.add(pet4);
    }


    @Test
    public void dogSpeakTest(){
        assertEquals("Jake went BARK!", pet1.speak());
    }
    @Test
    public void getNameTest(){
        assertEquals("Tom", pet2.getName());
    }
    @Test
    public void getTypeTest(){
        assertEquals("Fish", pet3.getType());
    }

    @Test
    public void catSpeakTest(){
        assertEquals("Tom went MEOW!", pet2.speak());
    }

    @Test
    public void fishSpeakTest(){
        assertEquals("Nemo went *blub*", pet3.speak());
    }


}
