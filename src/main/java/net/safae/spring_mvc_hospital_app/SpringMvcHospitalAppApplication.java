package net.safae.spring_mvc_hospital_app;

import net.safae.spring_mvc_hospital_app.entities.Patient;
import net.safae.spring_mvc_hospital_app.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringMvcHospitalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcHospitalAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
		return args -> {
			// NoArgsConstructor
			Patient p1 = new Patient();
			p1.setNom("Martin");
			p1.setPrenom("Sophie");
			p1.setDateNaissance(LocalDate.of(1990, 8, 22));
			p1.setAdresse("45 Avenue des Champs-Élysées, Paris");
			p1.setNumeroTelephone("0612345678");
			p1.setGroupeSanguin("O+");
			p1.setAllergie("Pénicilline");
			p1.setAntecedentMedical("Asthme");

			// AllArgsConstructor
			Patient p2 = new Patient(
					null,
					"Dubois",
					"Henri",
					LocalDate.of(1955, 3, 12),
					"12 Rue du Faubourg Saint-Honoré, Paris",
					"0698765432",
					"A-",
					"Crustacés",
					"Hypertension"
			);

			// Pattern Builder
			Patient p3 = Patient.builder()
					.nom("Leo")
					.prenom("Michael")
					.allergie("Lactose")
					.dateNaissance(LocalDate.of(2018, 11, 5))
					.adresse("3 Boulevard de la Liberté, Lyon")
					.numeroTelephone("0745123698")
					.groupeSanguin("B+")
					.antecedentMedical("Otites à répétition")
					.build();

			patientRepository.save(p1);
			patientRepository.save(p2);
			patientRepository.save(p3);

			List<Patient> patients = patientRepository.findAll();
			patients.forEach(p-> {
				System.out.println(p.toString());
			});



		};
	}

}
