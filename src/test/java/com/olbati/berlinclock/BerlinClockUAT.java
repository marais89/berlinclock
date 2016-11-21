package com.olbati.berlinclock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * Created by marais on 10/11/2016.
 */
public class BerlinClockUAT {

    private BerlinClock berlinClock = new BerlinClock();

    @Test
    public void should_return_berlin_clock_format_when_time_is_13_17_01() {
        // Arrange  

        // Act  
        String[] result = berlinClock.convert(LocalTime.of(13, 17, 1));

        // Assert 
        assertThat(result[0]).isEqualTo("O");
        assertThat(result[1]).isEqualTo("RROO");
        assertThat(result[2]).isEqualTo("RRRO");
        assertThat(result[3]).isEqualTo("YYROOOOOOOO");
        assertThat(result[4]).isEqualTo("YYOO");
    }

}
