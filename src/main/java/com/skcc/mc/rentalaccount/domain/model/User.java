package com.skcc.mc.rentalaccount.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
@Table(name="user")
public class User extends UserAbstract {
    @Column(name="user_password")
    private String userPassword;
    @Column(name="user_name")
    private String userName;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="member_type")
    private String memberType;
    //
}
