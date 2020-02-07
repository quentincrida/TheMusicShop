import instruments.Theorbo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheorboTest {

    private Theorbo theorbo1;

    @Before
    public void before(){
        theorbo1 = new Theorbo(12);
    }

    @Test
    public void getNumberOfFrets(){
        assertEquals(12, theorbo1.getNumberOfFrets());
    }
}
