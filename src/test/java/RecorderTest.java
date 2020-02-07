import instruments.Recorder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecorderTest {
    private Recorder recorder1;

    @Before
        public void before(){
        recorder1 = new Recorder("Treble");
    }

    @Test
    public void getType(){
        assertEquals("Treble", recorder1.getType());
    }
}
