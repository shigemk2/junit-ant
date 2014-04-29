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

    @Test
    public void testSubInt() {
        assertThat(Main.sub(10, 5), is(5));
    }

    @Test
    public void testSubDouble() {
        assertThat(Main.sub(10.0, 5.0), is(5.0));
    }
}
