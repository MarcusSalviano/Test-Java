public class ExecuteTests {
    public static void main(String args[]) {
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
    }
}
