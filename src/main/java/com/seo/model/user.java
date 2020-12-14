package com.seo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(length = 40, nullable = false )
    private String email;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 12)
    private String phone;

    @Builder
    public user(String email, String name, String phone){
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return String.format(
                "user[user_id=%d, email='%s', phone='%s']",
                this.user_id, this.email, this.phone
        );
    }

}
