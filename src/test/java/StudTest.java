import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Gozner on 5/10/2017.
 */
public class StudTest {

    public Stud stud;

    @Before
    public void setUp() throws Exception {
        stud = new Stud("Mada");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {
        assert  stud.getName().equals("Mada");
        System.out.println("s");
    }
}