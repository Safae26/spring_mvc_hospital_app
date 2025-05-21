package net.safae.spring_mvc_hospital_app.web;

import net.safae.spring_mvc_hospital_app.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
    public String index(Model model) {
        model.addAttribute("ListePatients", patientRepository.findAll());
        return "patients";
    }
    @GetMapping("/deletePatient")
    public String deletePatient(@RequestParam(name="id") Long idPatient) {
        patientRepository.deleteById(idPatient);
        return "redirect:/index";
    }
}
