import java.util.LinkedList;

public class Test7 {

    public String execute(LinkedList<String> list1, LinkedList<String> list2) {
        if (list1.size() > list2.size()) {
            return getIntesection(list1, list2);
        }
        else {
            return getIntesection(list2, list1);
        }
    }

    private String getIntesection(LinkedList<String> list1, LinkedList<String> list2) {
        int x = list1.size()-list2.size();
        int y = 0;
        boolean hasNext = true;

        while (hasNext) {
            if(list1.get(x).equals(list2.get(y))) {
                return  list1.get(x);
            }

            x++;
            y++;

            if(list1.size() == x && list2.size() == y) {
                hasNext = false;
            }
        }

        return null;
    }
}
