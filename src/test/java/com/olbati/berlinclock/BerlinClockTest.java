package com.olbati.berlinclock;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.*;

/**
 * Created by marais on 10/11/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class BerlinClockTest {

    @Mock
    private BerlinClockHour berlinClockHourMock;

    @Mock
    private BerlinClockMinute berlinClockMinuteMock;

    @Mock
    private BerlinClockSecond berlinClockSecondMock;

    @InjectMocks
    private BerlinClock berlinClock;

    @Test
    public void should_return_berlin_clock_format_when_time_is_13_17_01() {
        // Arrange  
        when(berlinClockHourMock.convert(13)).thenReturn(new String[]{"RROO", "RRRO"});
        when(berlinClockMinuteMock.convert(17)).thenReturn(new String[]{"YYROOOOOOOO", "YYOO"});
        when(berlinClockSecondMock.convert(1)).thenReturn("O");

        // Act  
        String[] result = berlinClock.convert(LocalTime.of(13, 17, 1));

        // Assert 
        assertThat(result[0]).isEqualTo("O");
        assertThat(result[1]).isEqualTo("RROO");
        assertThat(result[2]).isEqualTo("RRRO");
        assertThat(result[3]).isEqualTo("YYROOOOOOOO");
        assertThat(result[4]).isEqualTo("YYOO");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_time_is_null() {
        // Arrange  

        // Act  
        berlinClock.convert(null);

        // Assert 
    }
}
