package com.example.pocservice.modelclass;


import jakarta.persistence.*;

@Entity
@Table(name="signup")
public class signup {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;

}


