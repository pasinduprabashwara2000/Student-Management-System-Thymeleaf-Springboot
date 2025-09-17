package edu.ijse.layered.spring.controller;

import edu.ijse.layered.spring.dto.StudentDto;
import edu.ijse.layered.spring.service.custom.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/api/student")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity <Void> saveStudent(@RequestBody StudentDto studentDto){
        try {
            studentService.saveStudent(studentDto);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity <Void> updateStudent(@PathVariable String regNum, @RequestBody StudentDto newStudentDto){

        try {
            studentService.updateStudent(regNum, newStudentDto);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping
    public ResponseEntity <Void> deleteStudent(@PathVariable String regNum){
        try {
            studentService.deleteStudent(regNum);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
