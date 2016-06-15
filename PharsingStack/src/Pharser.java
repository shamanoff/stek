public class Pharser {

    private String input;
    private StackPH stackPH;


    public Pharser(String in) {

        input = in;
        stackPH = new StackPH(input.length());


    }

    public String showStack() {
        String temp = "";
        while (!stackPH.isEmpty()){
          //  char tempChar = stackPH.pop(input.charAt(i));
           // temp = temp + tempChar;
        }
        return temp;
    }

    public void PHString() {
        for (int i = 0; i < input.length(); i++) {
            char curChar = input.charAt(i);

            switch (curChar) {
                case '{':
                case '[':
                case '(':
                    stackPH.push(curChar);
                    break;
            }
            switch (curChar) {
                case '}':
                case ']':
                case ')':
                    if (!stackPH.isEmpty()) {
                        char temp = stackPH.pop(input.charAt(i));
                        if ((curChar == '}' && temp != '{') || (curChar == ']' && temp != '[') || (curChar == ')' && temp != '(')) {
                            System.out.println("error at char " + curChar + " at pozition " + i);
                        }
                    } else System.out.println("error at char " + curChar + " at pozition " + i);
                    break;
            }
        }



//            if(curChar == '('){
//                stackPH.push(curChar);
//            }
//
////
//            if(curChar == ')'){
//                if(stackPH.isEmpty()){
//                    i++;
//                    System.out.println("error at "+i+" pozition");
//                    break;
//                }
//                stackPH.pop();
//
//            }

       /* if(!stackPH.isEmpty()){
            System.out.println("error - to mach open "+ showStack());
        }*/

    }
}
