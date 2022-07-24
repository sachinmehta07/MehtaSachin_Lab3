package com.gl.driver;

import com.gl.services.BalancingBrackets;

public class DriverBalancingBracket {
    public static void main(String[] args) {
        String input = "([[{}]])";
        boolean check = BalancingBrackets.bracketCheck(input);

        if (check)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");

    }
}
