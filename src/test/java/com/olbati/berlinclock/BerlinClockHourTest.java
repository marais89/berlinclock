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
@RunWith(MockitoJUnitRunner.class)
public class BerlinClockHourTest {

    @InjectMocks
    private BerlinClockHour berlinClockHour;

    @Test
    public void should_return_berlin_clock_format_when_hour_is_13() {
        // Arrange  

        // Act  
        String[] result = berlinClockHour.convert(13);

        // Assert 
        assertThat(result[0]).isEqualTo("RROO");
        assertThat(result[1]).isEqualTo("RRRO");
    }


}
