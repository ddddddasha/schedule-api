package app.simple.schedule.services;

import app.simple.schedule.entities.Schedule;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class ScheduleService {
    
    @Value("${custom.file-path}")
    private String filePath;
    public List<Schedule> getSchedules() throws IOException {
        try (FileReader reader = new FileReader(filePath)) {
            CsvToBean<Schedule> csvToBean = new CsvToBeanBuilder<Schedule>(reader)
                    .withType(Schedule.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            return csvToBean.parse();
        } catch (IOException e) {
            throw new IOException("Error reading CSV file", e);
        }
    }
}
