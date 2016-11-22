package com.olbati.berlinclock;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by marais on 21/11/2016.
 */
public class BerlinClockSecondTest {

    BerlinClockSecond berlinClockSecond = new BerlinClockSecond();

    @Test
    public void should_return_Y_second_is_00() {
        // Arrange  

        // Act  
        String result = berlinClockSecond.convert(00);
        // Assert 
        assertThat(result).isEqualTo("Y");
    }

    @Test
    public void should_return_Y_second_is_01() {
        // Arrange  

        // Act  
        String result = berlinClockSecond.convert(01);
        // Assert 
        assertThat(result).isEqualTo("O");
    }

    @Test
    public void should_return_Y_second_is_55() {
        // Arrange  

        // Act  
        String result = berlinClockSecond.convert(55);
        // Assert 
        assertThat(result).isEqualTo("O");
    }
}
