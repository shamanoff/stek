package com.company;

public class InvertPH {
    private String input;

    public InvertPH(String in) {
        input = in;

    }
    public String invertString (){
        StackM stack = new StackM(input.length());
        for (int i = 0; i <input.length() ; i++) {
            stack.push(input.charAt(i));
        }

        String first = "";
        String second = "";
        for (int i = 0; i <input.length()/2 ; i++) {
            first = first + stack.pop();
        }



       while (!stack.isEmpty()){
           second = second + stack.pop();
       }

        String output = "" + second + first;
        return output;
    }

}
