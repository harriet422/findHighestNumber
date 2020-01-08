package com.qa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class NumberCruncherTest {
    @Test
    public void find_highest_number_in_array_oif_one() throws Exception {
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
    public void find_highest_number_out_of_two_numbers() throws Exception {
        //arrange
        int input[] = {13, 4};
        int expResult = 13;
        NumberCruncher cut = new NumberCruncher();
        //act
        int result = cut.findHighestNumber(input);
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void highest_number_when_there_are_multiple_equal_highest_numbers(){
        //arrange
        int input = 0;
        //not finished
    }

    @Test
    public void use_lambdas(){
        //arrange
        int input[] = {};
        NumberCruncher cut = new NumberCruncher();
        //act
        assertThrows(MyException.class, () ->cut.findHighestNumber(input));

    }
}