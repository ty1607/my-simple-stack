import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class SimpleStack implements MySimpleStack {

    List<Item> stack = new LinkedList<>();


    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int getSize(){
        return stack.size();
    }


    public void push(Item item){
        stack.add(item);

    }

    public Item peek() throws EmptyStackException{
        return stack.get(0);

    }

    public Item pop() throws EmptyStackException{

        return stack.remove(0);
    }
}
