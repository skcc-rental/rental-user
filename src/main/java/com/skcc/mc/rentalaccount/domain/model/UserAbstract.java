package com.skcc.mc.rentalaccount.domain.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@MappedSuperclass
@EqualsAndHashCode
public class UserAbstract {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="user_id")
    protected Long userId;

    public  Long getUserId() {
        return userId;
    }
}
