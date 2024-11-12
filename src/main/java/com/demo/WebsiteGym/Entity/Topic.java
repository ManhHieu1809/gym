package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "topic")
@Getter
@Setter
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String topicID;
    private String topicName;
    private String description;
    private Timestamp createdDate;

    @OneToMany(mappedBy = "topic",cascade = CascadeType.ALL)
    private List<FavoriteTopic> favoriteTopics;
}
