package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentService service;

    @PostMapping
    public Long save(@RequestBody StudentDto dto) {
        LOGGER.debug("start methode save: " ,dto);
        return service.save(dto);
    }

    @PutMapping
    public Boolean update(@RequestBody StudentDto dto) {
        LOGGER.debug("start methode update",dto);
        return service.update(dto);
    }

    @DeleteMapping("/{ids}")
    public boolean delete(@PathVariable("ids")Long id) {
        LOGGER.debug("start methode delete",id);
        return service.deleteById(id);
    }

    @GetMapping
    public List<StudentDto> selectAll() {
        LOGGER.debug("start methode selectAll");
        return service.selectAll();
    }
}
