public class Pharser {

    private String input;

    public Pharser(String in) {
        input = in;

    }

    public String PHString() {
        StackPH stack = new StackPH(input.length());
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));

        }
        String output = "";
        char a = ')';
        char b = '}';
        char c = ']';
        while (!stack.isEmpty()) {

            char d = stack.pop();
            if(d!= a){
                output = output + stack.pop();
            }
            if(d==a){System.out.println("попался )");
            };
//            switch (b) {
//                case ')':
//                    System.out.println("попался )");
//                    break;
//                case '}':
//                    System.out.println("попался }");
//                    break;
//                case ']':
//                    System.out.println("попался ]");
//                    break;
//            }


        }

        return output;
    }
}
