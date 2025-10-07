package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nameFull;
    private String CPF;
    private int age;
    private LocalDate dateBirth;

    private String mainEmail;
    private String phoneNumber;
    private String phoneNumberAlternative;

    private String address;
    private String neighborhood;
    private String city;
    private String state;
    private String cep;

    private String password;

    private String profile; //  ADMIN, CUSTOMER, EMPLOYEE
    private boolean active;

    private LocalDate dateRegistration;
    private LocalDate lastLogin;
    private LocalDate updateDate;

}
