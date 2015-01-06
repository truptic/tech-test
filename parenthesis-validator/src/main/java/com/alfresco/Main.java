package com.alfresco;

import com.alfresco.validator.ParenthesisValidator;

public class Main
{
    public static void main( String[] args ){
       if(args.length == 0){
           System.err.println("Input string required.");
           System.exit(0);
       }

        ParenthesisValidator validator = new ParenthesisValidator(args[0]);
        System.out.println(args[0] + " :: " +validator.validate());

    }
}
