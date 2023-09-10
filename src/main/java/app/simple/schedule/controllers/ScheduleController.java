package app.simple.schedule.controllers;

import app.simple.schedule.entities.Schedule;
import app.simple.schedule.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @GetMapping
    public List<Schedule> getSchedule() throws IOException {
        return scheduleService.getSchedules();
    }
}
