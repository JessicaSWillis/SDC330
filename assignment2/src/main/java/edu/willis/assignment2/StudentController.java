package edu.willis.assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService service = new StudentService(new FileStudentStorage());

    @GetMapping("/studentform")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/submitStudent")
    public String submitStudent(Student student, Model model) {
        if (!service.isValid(student)) {
            model.addAttribute("errorMessage", "All fields are required. Please complete the form.");
            model.addAttribute("student", student);
            return "form";
        }

        service.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String showStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "students";
    }
}
