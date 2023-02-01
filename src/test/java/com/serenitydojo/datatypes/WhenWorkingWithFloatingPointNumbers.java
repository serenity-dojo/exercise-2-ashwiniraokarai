package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celsius to Fahrenheit
    // The equation is: fahrenheit = (9 / 5) * celsius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0d;
        double farenheit = 0.0d;

        // TODO: Use a floating point calculation to calculate the farenheit equivalent of the celcius value.
        //Ash: Expressed the elements of division as Doubles instead of integer type suggested in the provided equation. The integers were resulting in a value of 1 instead of 1.8 resulting in
        //the fahrenheit value to evaluate inaccurately to 59-something instead of the expected value 80.6
        farenheit = (9.0 / 5.0 * celcius) + 32;
        assertThat(farenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertMetersToFeet() {
        int weightInKilograms = 50;
        double weightInPounds = 0;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds
        weightInPounds = weightInKilograms * 2.20462;
        assertThat(weightInPounds, equalTo(110.231));
    }
}
