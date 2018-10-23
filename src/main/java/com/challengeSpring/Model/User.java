package com.challengeSpring.Model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "users"
)
public class User {

   @Id
   @GeneratedValue(
           strategy = GenerationType.AUTO
   )
   @Column(name = "id", unique = true, nullable = false)
   private Long userId;

   @Email
   @Column(name = "email", nullable = false)
   private String email;

   //String(YYYY-MM-DD)
   @Column(name = "dateOfBirth", nullable = false)
   private String dateOfBirth;

   @Column(name = "lastName", nullable = false)
   private String lastName;

   @Column(name = "firstName", nullable = false)
   private String firstName;

   @Column(name = "password", nullable = false)
   private String password;
   //String(Optional)
   @Column(name = "gender", nullable = false)
   private Gender gender;

    public enum Gender {
        MALE, FEMALE
    }
    public Number getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
