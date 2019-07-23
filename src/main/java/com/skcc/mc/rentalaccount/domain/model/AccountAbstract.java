package com.skcc.mc.rentalaccount.domain.model;

import lombok.EqualsAndHashCode;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EqualsAndHashCode
public class AccountAbstract {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    protected Long id;

    public Long getId() {
        return id;
    }
}
