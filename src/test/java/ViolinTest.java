import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    private Violin violin1;

    @Before
    public void before() {
        violin1 = new Violin(4, "Full size");
    }
        @Test
        public void getNumberOfStrings() {
            assertEquals(4, violin1.getNumberOfStrings());

    }
}
