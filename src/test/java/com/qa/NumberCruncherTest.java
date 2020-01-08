package com.qa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class NumberCruncherTest {
    @Test
    public void find_highest_number_in_array_oif_one(){
        //arrange
        int input[] = {3};
        int expResult = 3;
        NumberCruncher cut = new NumberCruncher();
        //act
        int result = cut.findHighestNumber(input);
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void find_highest_number_out_of_two_numbers(){
        //arrange
        int input[] = {13, 4};
        int expResult = 13;
        NumberCruncher cut = new NumberCruncher();
        //act
        int result = cut.findHighestNumberOutOfTwoNumbers(input);
        //assert
        assertEquals(expResult, result);
    }
}