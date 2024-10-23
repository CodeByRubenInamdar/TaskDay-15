package com.demo.Dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;  // Changed from int to long
    private String name;
    private String city;
    private int fees; // Ensure fees is declared

    public Student() {
        super();
    }

    public Student(long id, String name, String city, int fees) { // Changed from int to long
        super();
        this.id = id; // Changed from this.Long to this.id
        this.name = name;
        this.city = city;
        this.fees = fees;
    }

    public long getId() { // Changed return type from int to long
        return id;
    }

    public void setId(long id) { // Changed parameter type from int to long
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + ", fees=" + fees + "]";
    }
}
