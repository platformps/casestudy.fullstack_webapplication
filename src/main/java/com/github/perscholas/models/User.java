package com.github.perscholas.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table //(name = "user_account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @Column //(name = "name")
    private String name;

    @Column //(name = "email")
    private String email;

    @Column //(name = "address")
    private String address;

    @Column //(name = "phone_number")
    private String phNumber;

    @Column //(name = "password")
    private String password;

    @ManyToOne
    private ServiceCategory serviceCategory;


    public User() {

    }

    public User(Long id, String name, String email, String address, String phoneNumber, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phNumber = phoneNumber;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email) &&
                Objects.equals(address, user.address) &&
                Objects.equals(phNumber, user.phNumber) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
