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

			// Constructeur par défaut + setters
			Patient p4 = new Patient();
			p4.setNom("Bernard");
			p4.setPrenom("Alice");
			p4.setDateNaissance(LocalDate.of(1985, 4, 15));
			p4.setAdresse("8 Rue de Rivoli, Paris");
			p4.setNumeroTelephone("0678451236");
			p4.setGroupeSanguin("AB+");
			p4.setAllergie("Aucune");
			p4.setAntecedentMedical("Diabète type 2");

			// AllArgsConstructor
			Patient p5 = new Patient(
					null,
					"Leroy",
					"Jean",
					LocalDate.of(1972, 7, 30),
					"22 Avenue Montaigne, Paris",
					"0632145698",
					"O-",
					"Arachides",
					"Chirurgie du genou en 2010"
			);

			// Pattern Builder
			Patient p6 = Patient.builder()
					.nom("Garcia")
					.prenom("Maria")
					.dateNaissance(LocalDate.of(1995, 12, 8))
					.adresse("15 Rue de la République, Marseille")
					.numeroTelephone("0789456123")
					.groupeSanguin("A+")
					.allergie("Aspirine")
					.antecedentMedical("Migraines chroniques")
					.build();

			// Constructeur par défaut + setters
			Patient p7 = new Patient();
			p7.setNom("Petit");
			p7.setPrenom("Luc");
			p7.setDateNaissance(LocalDate.of(2002, 9, 17));
			p7.setAdresse("5 Rue du Commerce, Lille");
			p7.setNumeroTelephone("0698745632");
			p7.setGroupeSanguin("B-");
			p7.setAllergie("Poisson");
			p7.setAntecedentMedical("Appendicectomie");

			// AllArgsConstructor
			Patient p8 = new Patient(
					null,
					"Moreau",
					"Elodie",
					LocalDate.of(1988, 1, 25),
					"30 Rue de la Paix, Nice",
					"0645782316",
					"A-",
					"Noix",
					"Dépression"
			);

			// Pattern Builder
			Patient p9 = Patient.builder()
					.nom("Roux")
					.prenom("Thomas")
					.dateNaissance(LocalDate.of(1978, 6, 14))
					.adresse("7 Avenue des Ternes, Paris")
					.numeroTelephone("0623458712")
					.groupeSanguin("O+")
					.allergie("Aucune")
					.antecedentMedical("Hypercholestérolémie")
					.build();

			// Constructeur par défaut + setters
			Patient p10 = new Patient();
			p10.setNom("Fournier");
			p10.setPrenom("Camille");
			p10.setDateNaissance(LocalDate.of(1993, 11, 3));
			p10.setAdresse("12 Boulevard Voltaire, Bordeaux");
			p10.setNumeroTelephone("0756893214");
			p10.setGroupeSanguin("AB-");
			p10.setAllergie("Latex");
			p10.setAntecedentMedical("Eczéma");

			// AllArgsConstructor
			Patient p11 = new Patient(
					null,
					"Lefebvre",
					"Pierre",
					LocalDate.of(1965, 2, 28),
					"18 Rue du Temple, Strasbourg",
					"0687124596",
					"B+",
					"Œufs",
					"Infarctus en 2018"
			);

			// Pattern Builder
			Patient p12 = Patient.builder()
					.nom("Simon")
					.prenom("Julie")
					.dateNaissance(LocalDate.of(2005, 5, 19))
					.adresse("9 Rue de la Pompe, Paris")
					.numeroTelephone("0798654321")
					.groupeSanguin("A+")
					.allergie("Moisissures")
					.antecedentMedical("Asthme allergique")
					.build();

			// Constructeur par défaut + setters
			Patient p13 = new Patient();
			p13.setNom("Michel");
			p13.setPrenom("Antoine");
			p13.setDateNaissance(LocalDate.of(1980, 8, 7));
			p13.setAdresse("25 Cours Mirabeau, Aix-en-Provence");
			p13.setNumeroTelephone("0615239847");
			p13.setGroupeSanguin("O-");
			p13.setAllergie("Sulfamides");
			p13.setAntecedentMedical("Ulcère gastrique");

			// AllArgsConstructor
			Patient p14 = new Patient(
					null,
					"Blanc",
					"Isabelle",
					LocalDate.of(1975, 4, 22),
					"14 Rue de la Roquette, Paris",
					"0645987123",
					"AB+",
					"Animaux",
					"Fibromyalgie"
			);

			// Pattern Builder
			Patient p15 = Patient.builder()
					.nom("Girard")
					.prenom("Philippe")
					.dateNaissance(LocalDate.of(1998, 12, 30))
					.adresse("6 Rue du Cherche-Midi, Paris")
					.numeroTelephone("0789456123")
					.groupeSanguin("B+")
					.allergie("Pollen")
					.antecedentMedical("Rhinite allergique")
					.build();

			// Constructeur par défaut + setters
			Patient p16 = new Patient();
			p16.setNom("Dupont");
			p16.setPrenom("Caroline");
			p16.setDateNaissance(LocalDate.of(1987, 7, 14));
			p16.setAdresse("33 Avenue Jean Jaurès, Toulouse");
			p16.setNumeroTelephone("0632458796");
			p16.setGroupeSanguin("A-");
			p16.setAllergie("Moutarde");
			p16.setAntecedentMedical("Césarienne en 2015");

			// AllArgsConstructor
			Patient p17 = new Patient(
					null,
					"Lambert",
					"Nicolas",
					LocalDate.of(1991, 10, 11),
					"21 Rue de la République, Lyon",
					"0698745632",
					"O+",
					"Aucune",
					"Sciatique"
			);

			// Pattern Builder
			Patient p18 = Patient.builder()
					.nom("Rousseau")
					.prenom("Amandine")
					.dateNaissance(LocalDate.of(2008, 3, 27))
					.adresse("4 Rue des Rosiers, Paris")
					.numeroTelephone("0756341289")
					.groupeSanguin("A+")
					.allergie("Antibiotiques")
					.antecedentMedical("Amygdalectomie")
					.build();

			// Constructeur par défaut + setters
			Patient p19 = new Patient();
			p19.setNom("Fontaine");
			p19.setPrenom("David");
			p19.setDateNaissance(LocalDate.of(1968, 9, 9));
			p19.setAdresse("17 Rue de Passy, Paris");
			p19.setNumeroTelephone("0612378459");
			p19.setGroupeSanguin("B-");
			p19.setAllergie("Soja");
			p19.setAntecedentMedical("Hernie discale");

			// AllArgsConstructor
			Patient p20 = new Patient(
					null,
					"Chevalier",
					"Valérie",
					LocalDate.of(1983, 2, 14),
					"8 Rue de la Huchette, Paris",
					"0678451236",
					"AB-",
					"Gluten",
					"Maladie cœliaque"
			);
			patientRepository.save(p1);
			patientRepository.save(p2);
			patientRepository.save(p3);
			patientRepository.save(p4);
			patientRepository.save(p5);
			patientRepository.save(p6);
			patientRepository.save(p7);
			patientRepository.save(p8);
			patientRepository.save(p9);
			patientRepository.save(p10);
			patientRepository.save(p11);
			patientRepository.save(p12);
			patientRepository.save(p13);
			patientRepository.save(p14);
			patientRepository.save(p15);
			patientRepository.save(p16);
			patientRepository.save(p17);
			patientRepository.save(p18);
			patientRepository.save(p19);
			patientRepository.save(p20);

			List<Patient> patients = patientRepository.findAll();
			patients.forEach(p-> {
				System.out.println(p.toString());
			});



		};
	}

}
