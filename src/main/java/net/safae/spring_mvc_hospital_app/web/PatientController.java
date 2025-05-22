package net.safae.spring_mvc_hospital_app.web;

import net.safae.spring_mvc_hospital_app.entities.Patient;
import net.safae.spring_mvc_hospital_app.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model, @RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name = "size", defaultValue = "5") int size) {
        Page<Patient> pagePatients = patientRepository.findAll(PageRequest.of(page, size));
        model.addAttribute("ListePatients", pagePatients.getContent());
        model.addAttribute("pages", new int [pagePatients.getTotalPages()]);
        model.addAttribute("currentPage", pagePatients.getNumber());
        return "patients";
    }
    @GetMapping("/deletePatient")
    public String deletePatient(@RequestParam(name="id") Long idPatient) {
        patientRepository.deleteById(idPatient);
        return "redirect:/index";
    }
}
