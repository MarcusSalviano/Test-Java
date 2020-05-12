public class Test2 {

    public boolean execute(String param1, String param2){
        if(param1.length() != param2.length()) {
            return false;
        }

        if(param1.charAt(0) != param2.charAt(0)) {
            return false;
        }

        int changedCount = 0;
        for(int x = 0; x < param1.length(); x++) {
            if(param1.charAt(x) != param2.charAt(x)) {
                changedCount++;
            }
        }

        int maxChanges = param1.length()/3*2;

        if(changedCount > maxChanges) {
            return false;
        }

        return true;
    }

}
