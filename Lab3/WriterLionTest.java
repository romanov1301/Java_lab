package ua.iot.io;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class WriterLionTest extends TestCase {
    WriterLion writerLion;
    List<Animal> animals;

    @Before
    public void setUp() {
        writerLion = new WriterLion();
        animals = new ArrayList<>();
        animals.add(new Lion("Lion", 45,78));
        animals.add(new Animal("KI",4));
        writerLion.writetofile(animals);

    }

    public void testWritetofile() {

    }
}
