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
        while (!stack.isEmpty()) {
            char a = ')';
            char b = '}';
            char c = ']';
            switch (a | b | c) {
                case ')':
                    System.out.println("попался )");
                    break;
                case '}':
                    System.out.println("попался }");
                    break;
                case ']':
                    System.out.println("попался ]");
                    break;
            }

            output = output + stack.pop();
        }

        return output;
    }
}
