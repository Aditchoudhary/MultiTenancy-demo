package com.ac.multitenancydemo.controller;

import org.springframework.web.bind.annotation.*;

import com.ac.multitenancydemo.domain.Teacher;
import com.ac.multitenancydemo.domain.TeacherRepository;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherRepository userRepository;

    public TeacherController(TeacherRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public Teacher addUser(@RequestBody TeacherRequestBody userRequestBody) {
        Teacher userDomain = new Teacher(userRequestBody.getName());
        return userRepository.save(userDomain);
    }

    @GetMapping
    public List<Teacher> getAll() {
        return userRepository.findAll();
    }
}
