import java.util.LinkedList;

public class ExecuteTests {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------");

        Test1 test1 = new Test1();

        String test1param = "User is not allowed    ";
        System.out.println("Test 1 using String");
        System.out.println(test1.executeWithString(test1param));
        System.out.println("Test 1 using char[]");
        System.out.println(test1.executeWithChar(test1param.toCharArray()));

        System.out.println("-----------------------------------------------------------------------");

        Test2 test2 = new Test2();

        System.out.println("Teste 2 params[\"you\",\"yuo\"] = " + test2.execute("you", "yuo"));
        System.out.println("Teste 2 params[\"probably\",\"porbalby\"] = " + test2.execute("probably", "porbalby"));
        System.out.println("Teste 2 params[\"despite\",\"desptie\"] = " + test2.execute("despite", "desptie"));
        System.out.println("Teste 2 params[\"moon\",\"nmoo\"] = " + test2.execute("moon", "nmoo"));
        System.out.println("Teste 2 params[\"misspellings\",\"mpeissngslli\"] = " + test2.execute("misspellings", "mpeissngslli"));

        System.out.println("-----------------------------------------------------------------------");

        Test3 test3 = new Test3();

        System.out.println("Teste 3 params[\"pale\",\"ple\"] = " + test3.execute("pale", "ple"));
        System.out.println("Teste 3 params[\"pale\",\"pales\"] = " + test3.execute("pale", "pales"));
        System.out.println("Teste 3 params[\"pale\",\"bale\"] = " + test3.execute("pale", "bale"));
        System.out.println("Teste 3 params[\"pale\",\"bake\"] = " + test3.execute("pale", "bake"));
        System.out.println("Teste 3 params[\"pale\",\"pale0\"] = " + test3.execute("pale", "pale"));

        System.out.println("-----------------------------------------------------------------------");

        Test5 test5 = new Test5();

        LinkedList<String> linkedListParam = new LinkedList<String>();
        linkedListParam.add("abc");
        linkedListParam.add("cba");
        linkedListParam.add("abc");
        linkedListParam.add("aaa");
        linkedListParam.add("abc");
        linkedListParam.add("abc");
        linkedListParam.add("ddd");
        linkedListParam.add("aaa");
        linkedListParam.add("abc");

        System.out.println("linkedListParam = " + linkedListParam);
        System.out.println("Teste 5 remove duplicate = " + test5.execute(linkedListParam));

        System.out.println("-----------------------------------------------------------------------");

        Test7 test7 = new Test7();
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list1.add("C");
        list1.add("A");
        list1.add("E");
        list1.add("H");
        list1.add("J");
        list1.add("B");

        list2.add("D");
        list2.add("F");
        list2.add("J");
        list2.add("B");

        System.out.println("List 1 - " + list1);
        System.out.println("List 2 - " + list2);
        System.out.println("List intersection - " + test7.execute(list1, list2));

        System.out.println("-----------------------------------------------------------------------");
    }
}
