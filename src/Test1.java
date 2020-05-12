public class Test1 {

    public String executeWithString (String param) {
        param = param.trim();
        param = param.replaceAll(" ", "&32");
        return param;
    }

    public char[] executeWithChar (char[] param) {
        int spaceCount = 0;
        int rigthSpaces = 0;
        boolean findChar = false;

        for(int x = param.length-1; x>=0; x--) {
            if(param[x] == ' ') {
                if(!findChar) {
                    rigthSpaces++;
                } else {
                    spaceCount++;
                }
            } else {
                findChar = true;
            }
        }

        int charLength = param.length - rigthSpaces + (spaceCount*2);
        char[] returnChar = new char[charLength];
        int returnCharIndex = 0;

        for(int x = 0; x < param.length-rigthSpaces; x++) {
            if (param[x] != ' ') {
                returnChar[returnCharIndex] = param[x];
                returnCharIndex++;
            } else {
                returnChar[returnCharIndex] = '&';
                returnChar[returnCharIndex+1] = '3';
                returnChar[returnCharIndex+2] = '2';
                returnCharIndex += 3;
            }
        }
        return returnChar;
    }
}
