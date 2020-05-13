import java.util.LinkedList;
import java.util.HashSet;

public class Test5 {

    public LinkedList<String>  execute (LinkedList<String> linkedList) {

            HashSet<String> hash = new HashSet<>();
            int x = 0;
            boolean hasNext = true;
            while(hasNext)
            {
                if(x == linkedList.size()-1)
                    hasNext = false;

                if (hash.contains(linkedList.get(x))) {
                    linkedList.remove(x);
                } else {
                    hash.add(linkedList.get(x));
                    x++;
                }
            }

        return linkedList;
    }
}
