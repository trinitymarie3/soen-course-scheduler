package com.concordia.course_scheduler;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public static List<Course> getCourses() {
        // Note: PHYS and MATH prerequisites omitted as they should be completed when student is admitted to software engineering
        // GROUP 1 - No SOEN/COMP prerequisites
        Course comp248 = new Course("Object-Oriented Programming I", "COMP248", 60, 60, new ArrayList<>());
        Course comp232 = new Course("Mathematics for Computer Science", "COMP232", 60, 60, new ArrayList<>());
        Course engr201 = new Course("Professional Practice and Responsibility", "ENGR201", 60, 60, new ArrayList<>());
        Course engr202 = new Course("Sustainable Development", "ENGR202", 60, 60, new ArrayList<>());
        Course engr213 = new Course("Applied Ordinary Differential Equations", "ENGR213", 60, 60, new ArrayList<>());
        Course engr233 = new Course("Applied Advanced Calculus", "ENGR233", 60, 60, new ArrayList<>());
        Course encs282 = new Course("Technical Writing and Communication", "ENCS282", 60, 60, new ArrayList<>());
        Course engr371 = new Course("Probability and Statistics in Engineering", "ENGR371", 60, 60, new ArrayList<>());
        Course engr301 = new Course("Engineering Management Principles", "ENGR301", 60, 60, new ArrayList<>());
        Course engr392 = new Course("Impact of Technology on Society", "ENGR392", 60, 60, new ArrayList<>());
        Course elec275 = new Course("Principles of Electrical Engineering", "ELEC275", 60, 60, new ArrayList<>());
        Course soen228 = new Course("System Hardware", "SOEN228", 60, 60, new ArrayList<>());
        Course genEd = new Course("General Education Elective", "GENED-TBD", 60, 60, new ArrayList<>());
        Course engSci = new Course("Engineering Science Elective", "ENGSCI-TBD", 60, 60, new ArrayList<>());

        // GROUP 2 - Depends on Group 1
        Course comp249 = new Course("Object-Oriented Programming II", "COMP249", 60, 60, List.of(comp248));
        Course soen287 = new Course("Web Programming", "SOEN287", 60, 60, List.of(comp248));

        // GROUP 3 - Depends on Group 2
        Course comp348 = new Course("Principles of Programming Languages", "COMP348", 60, 60, List.of(comp249));
        Course comp352 = new Course("Data Structures and Algorithms", "COMP352", 60, 60, List.of(comp249));
        Course soen331 = new Course("Formal Methods for Software Engineering", "SOEN331", 60, 60, List.of(comp232, comp249));

        // GROUP 4 - Depends on Group 3
        Course comp346 = new Course("Operating Systems", "COMP346", 60, 60, List.of(soen228, comp352));
        Course soen341 = new Course("Software Process and Practices", "SOEN341", 60, 60, List.of(comp352, encs282));
        Course soen363 = new Course("Data Systems for Software Engineers", "SOEN363", 60, 60, List.of(comp352));
        Course comp335 = new Course("Introduction to Theoretical Computer Science", "COMP335", 60, 60, List.of(comp232, comp249));
        Course comp432 = new Course("Machine Learning", "COMP432", 60, 60, List.of(comp352));

        // GROUP 5 - Depends on Group 4
        Course soen342 = new Course("Software Requirements and Deployment", "SOEN342", 60, 60, List.of(soen341));
        Course soen384 = new Course("Management, Measurement and Quality Control", "SOEN384", 60, 60, List.of(encs282, soen341));
        Course soen357 = new Course("User Interface Design", "SOEN357", 60, 60, List.of(soen341));
        Course soen321 = new Course("Information Systems Security", "SOEN321", 60, 60, List.of(comp346));

        // GROUP 6 - Depends on Group 5
        Course soen343 = new Course("Software Architecture and Design", "SOEN343", 60, 60, List.of(soen341, soen342));
        Course soen345 = new Course("Software Testing, Verification and Quality Assurance", "SOEN345", 60, 60, List.of(soen343));

        // GROUP 7 - Depends on Group 6
        Course soen390 = new Course("Software Engineering Team Design Project", "SOEN390", 60, 60, List.of(soen345, soen357));

        // GROUP 8 - Depends on Group 7
        Course soen490 = new Course("Capstone Software Engineering Design Project", "SOEN490", 60, 60, List.of(soen390));

        return new ArrayList<>(List.of(
                comp248, comp232, engr201, engr202, engr213, engr233,
                encs282, engr371, engr301, engr392, elec275, soen228,
                genEd, engSci, comp249, soen287, comp348, comp352,
                soen331, comp346, soen341, soen363, comp335, comp432,
                soen342, soen384, soen357, soen321, soen343, soen345,
                soen390, soen490
        ));
    }
}
