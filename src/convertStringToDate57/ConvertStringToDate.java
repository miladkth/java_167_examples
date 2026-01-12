package convertStringToDate57;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertStringToDate {
    public static void main(String[] args) {
        String date = "2027-01-12";

        LocalDate dateToConvert = LocalDate.parse(date, DateTimeFormatter.ISO_DATE);
        System.out.println(dateToConvert);
    }
}
