package sample;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
public class MainTest {
    @Test
    public void testAdd() {
        assertThat(Main.add(10, 5), is(15));
    }
}
