package edu.wgu.d387_sample_code.internationalization;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TZConvert {

    public static String getTime() {

        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime ET = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));
        ZonedDateTime MT = time.withZoneSameInstant(ZoneId.of("America/Denver"));

        return ET.format(timeFormatter) + "ET, " +
                MT.format(timeFormatter) + "MT, " +
                UTC.format(timeFormatter) + "UTC";

    }

}
