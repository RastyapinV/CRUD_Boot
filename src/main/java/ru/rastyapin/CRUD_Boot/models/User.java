package ru.rastyapin.CRUD_Boot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "users", schema = "public", catalog = "test_db")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Name should not be empty.")
    @Size(min = 2, max = 1478, message = "Name should be longer then 2 characters.")
    private String name;

    @Min(value = 0, message = "Age should be greater then 0.")
    private int age;

    @NotEmpty(message = "Email should not be empty.")
    @Email(message = "Email should be valid.")
    private String email;
}
