package accesdades.ra2.ac11.accessdades_ra2_ac11.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accesdades.ra2.ac11.accessdades_ra2_ac11.model.students;
import accesdades.ra2.ac11.accessdades_ra2_ac11.repository.StudentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api")
public class studentsController {

    @Autowired
    StudentsRepository studentsRepository;

    @GetMapping("/students")
    public String getStudent() {
        return "Endpoint get";
    }

    @PostMapping("/students/batch")
    public String postStudent() {
        studentsRepository.save();
        return "Endpoint post";
    }
}
