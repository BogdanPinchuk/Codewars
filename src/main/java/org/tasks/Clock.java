package org.tasks;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Clock {
	public static int Past(int h, int m, int s)
	{
		if ((h < 0 || 23 < h) && (m < 0 || 59 < m) && (s < 0 || 59 < s)){
			throw new RuntimeException("Invalid input data");
		}

		Duration duration = Duration.of(h, ChronoUnit.HOURS)
				.plusMinutes(m)
				.plusSeconds(s);

		return (int) duration.toMillis();

		// 1 realization
		// (int)(TimeUnit.HOURS.toMillis(h) + TimeUnit.MINUTES.toMillis(m) + TimeUnit.SECONDS.toMillis(s));
		// 2 realization
		// LocalTime.of(h, m, s).toSecondOfDay() * 1000;
		// 3 realization
		// LocalTime.MIDNIGHT.until(LocalTime.of(h, m, s), ChronoUnit.MILLIS);
	}
}
