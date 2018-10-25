import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    @Test
    public void isEmpty() {
        SimpleStack stack = new SimpleStack();

        assertTrue(stack.isEmpty());

    }

    @Test
    public void getSize() {
        SimpleStack stack = new SimpleStack();
        Item item = new Item(5);

        assertEquals(0, stack.getSize());



    }

    @Test
    public void push() {
        SimpleStack stack = new SimpleStack();
        Item item = new Item(5);

        stack.push(item);
        assertNotEquals(0,stack.getSize());


    }

    @Test
    public void peek() {
        SimpleStack stack = new SimpleStack();
        Item item = new Item(5);

        stack.push(item);

        assertEquals(5,stack.peek().getMonNum());
    }

    @Test
    public void pop() {
        SimpleStack stack = new SimpleStack();
        Item item = new Item(5);
        stack.push(item);

        item = stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(5, item.getMonNum());

    }
}