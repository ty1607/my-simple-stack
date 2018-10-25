import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getMonNum() {
        Item item = new Item(5);
        assertEquals(5,item.getMonNum());
    }

    @Test
    public void setMonNum() {
        Item item = new Item(6);

        item.setMonNum(5);
        assertEquals(5, item.getMonNum());
    }
}