package com.concordia.course_scheduler;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping
    public List<Course> getAllCourses() {
        return DataLoader.getCourses();
    }
}
