package it.aulab.learningplatform.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.learningplatform.dto.CourseDTO;
import it.aulab.learningplatform.dto.CreateCourseDTO;
import it.aulab.learningplatform.dto.UpdateCourseDTO;
import it.aulab.learningplatform.service.CrudService;

@RestController
@RequestMapping("api/courses")
public class RestCourseController {

    @Autowired
    // @Qualifier("courseService")
    private CrudService<CourseDTO, Long, CreateCourseDTO, UpdateCourseDTO> courseService;

    // @Autowired
    // private CourseService courseServiceimpl;

    @GetMapping("all")
    public List<CourseDTO> getAll(@RequestParam Map<String, String> params) {
        return courseService.readAll();
    }


    @GetMapping
    public List<CourseDTO> get(@RequestParam Map<String, String> params) {
        return courseService.read(params);
    }

    @GetMapping("{id}")
    public CourseDTO getOne(@PathVariable ("id") Long id) throws Exception{
        return courseService.readOne(id);
    }


    @PostMapping
    public CourseDTO postOne(@RequestBody CreateCourseDTO createCourseDTO) {
        return courseService.create(createCourseDTO);
    }

    @DeleteMapping("{id}")
    public CourseDTO deleteOne(@PathVariable ("id") Long id) throws Exception {
        return courseService.delete(id);
    }


}
