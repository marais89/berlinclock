package com.olbati.berlinclock;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by marais on 21/11/2016.
 */

public class BerlinClockMinuteTest {


    private BerlinClockMinute berlinClockMinute = new BerlinClockMinute();

    @Test
    public void should_return_berlin_clock_format_when_minute_are_17(){
        // Arrange  

        // Act  
        String[] result= berlinClockMinute.convert(17);

        // Assert 
        assertThat(result[0]).isEqualTo("YYROOOOOOOO");
        assertThat(result[1]).isEqualTo("YYOO");

    }

    @Test
    public void should_return_berlin_clock_format_when_minute_are_20(){
        // Arrange  

        // Act  
        String[] result= berlinClockMinute.convert(20);

        // Assert 
        assertThat(result[0]).isEqualTo("YYRYOOOOOOO");
        assertThat(result[1]).isEqualTo("OOOO");

    }

    @Test
    public void should_return_berlin_clock_format_when_minute_are_59(){
        // Arrange  

        // Act  
        String[] result= berlinClockMinute.convert(59);

        // Assert 
        assertThat(result[0]).isEqualTo("YYRYYRYYRYY");
        assertThat(result[1]).isEqualTo("YYYY");

    }

    @Test
    public void should_return_berlin_clock_format_when_minute_are_00(){
        // Arrange  

        // Act  
        String[] result= berlinClockMinute.convert(00);

        // Assert 
        assertThat(result[0]).isEqualTo("OOOOOOOOOOO");
        assertThat(result[1]).isEqualTo("OOOO");

    }


}
