package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "paymentmethod")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String paymentMethodID;
    private String methodName;
    private String details;

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;
}
