package sample;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class MainTest {
    @Test
    public void testAddInt() {
        assertThat(Main.add(10, 5), is(15));
    }

    @Test
    public void testAddDouble() {
        assertThat(Main.add(10.5, 4.5), is(15.0));
    }
}
