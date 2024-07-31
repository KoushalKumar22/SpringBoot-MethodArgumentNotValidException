package com.Practise.MethodArgumentNaotValidError.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "NewProfile")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "Name", nullable = false)
    @NotBlank(message = "Name Cannot Be Empty")
    @Size(min = 4, message = "Name should be more than 2")
    String name;

    @Column(name = "Address")
    @NotBlank(message = "Please Enter An Valid Address")
    String address;

    @Column(name = "Age")
    @NotNull(message = "Age Cannot be Empty")
    @Size(min = 18,message = "Not Allowed for age less than 18")
    @Size(max = 45,message = "Age limit exceeded")
    int age;

    public User(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
