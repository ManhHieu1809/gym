package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "favoritetopic")
public class FavoriteTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String FavoriteID;
    private String topicID;

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "topicID",nullable = false)
    private Topic topic;
}
