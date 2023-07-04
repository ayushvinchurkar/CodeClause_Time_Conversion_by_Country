package com.valcon.com;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConversionExample {
	public static void main(String[] args) {
		// Get current time in the default time zone
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current time: " + localDateTime);

		// Convert to a specific time zone
		ZoneId sourceTimeZone = ZoneId.systemDefault();
		ZoneId targetTimeZone = ZoneId.of("America/New_York");

		ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(localDateTime, sourceTimeZone);
		ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetTimeZone);
		LocalDateTime targetLocalDateTime = targetZonedDateTime.toLocalDateTime();

		// Format and display the converted time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedTime = targetLocalDateTime.format(formatter);
		System.out.println("Converted time (New York): " + formattedTime);
	}
}

