package com.company;

public class Invert {
    private String input;

    public Invert(String in) {
        input = in;

    }
    public String invertString (){
        StackM stack = new StackM(input.length());
        for (int i = 0; i <input.length() ; i++) {
            stack.push(input.charAt(i));

        }     String output = "";
        while (!stack.isEmpty()){
            output = output + stack.pop();
        }return output;
    }

}
