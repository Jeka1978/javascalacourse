package my_spring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
public class ElfTest {

    @Test
    public void testThatInjectRandomIsWorkingCorrectly() {
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        Assert.assertNotEquals(0,elf.getPower());
        Assert.assertNotEquals(0,elf.getSpeed());
        System.out.println(elf);
    }
}