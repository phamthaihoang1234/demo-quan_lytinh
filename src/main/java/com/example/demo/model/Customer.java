package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name="list_customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;



    @ManyToOne
    @JoinColumn(name="province_id")
    private Province province;

    public Customer() {
    }

    public Customer(Long id, String firstname, String lastname, Province province) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
