package com.qa;

public class NumberCruncher {
    public int findHighestNumber(int[] input) throws MyException {
        if (input.length < 1)
            throw new MyException("Array length should be greater than zero");
        return input[0];
    }

       /* int a = 13;
        int b = 4;
        return (Math.max(a, b));*/
    }



    //if(input.length <1)
        //throw new MyException("Array length needs to be more than zero")

/*

return input[0];
}

    public int findHighestNumberOutOfTwoNumbers(int[] input){

*/