package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "progress")
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String progressID;
    private Date date;
    @Enumerated(EnumType.STRING)
    private Achievement achievement;

    public enum Achievement {
        COMPLETED, IN_PROGRESS, NOT_STARTED
    }

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;
}
