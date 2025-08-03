package org.example.schedule.controller;

import lombok.RequiredArgsConstructor;
import org.example.schedule.dto.ScheduleRequest;
import org.example.schedule.dto.ScheduleResponse;
import org.example.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @PostMapping("/schedules")
    public ScheduleResponse createSchedule(
            @RequestBody ScheduleRequest request) {
        return scheduleService.createSchedule(request);
    }

    @GetMapping("/schedules")
    public List<ScheduleResponse> getSchedules() {
        return scheduleService.getSchedules();
    }

    @GetMapping("/schedules/{scheduleId}")
    public ScheduleResponse getSchedule(
            @PathVariable Long scheduleId
    ) {
        return scheduleService.getSchedule(scheduleId);
    }

    @PutMapping("/schedules/{scheduleId}")
    public ScheduleResponse updateSchedule(
            @PathVariable Long scheduleId,
            @RequestBody ScheduleRequest scheduleRequest
    ) {
        return scheduleService.updateSchedule(scheduleId, scheduleRequest);
    }

    @DeleteMapping("/schedules/{scheduleId}")
    public void deleteSchedule(
            @PathVariable Long scheduleId
    ) {
        scheduleService.deleteSchedule(scheduleId);
    }
}