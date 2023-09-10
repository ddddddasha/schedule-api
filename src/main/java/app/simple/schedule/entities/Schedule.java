package app.simple.schedule.entities;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Schedule {
    
    @CsvBindByName
    private String subscriptionCategory;
    @CsvBindByName
    private String dayOfWeek;
    @CsvBindByName
    private String coachName;
    @CsvBindByName
    private String duration;
}
