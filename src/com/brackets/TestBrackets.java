package com.brackets;
import com.brackets.ValidBrackets;

public class TestBrackets {
    public static void main(String[] args) {
        ValidBrackets v = new ValidBrackets("(){}[]");
        if(v.validate()) {
            System.out.println("Valid brackets");
        } else {
            System.out.println("Invalid brackets");
        }
    }
}
