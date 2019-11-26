package hello;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class WebController implements WebMvcConfigurer {

    private final StudentRepo studentRepo;

    public  WebController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(Student student) {
        return "form";
    }

    @PostMapping("/")
    public String checkPersonInfo(@Valid Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "form";
        }
        studentRepo.save(student);
        return "redirect:/results";
    }
}
