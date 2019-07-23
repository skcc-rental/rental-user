package com.skcc.mc.rentalaccount.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;


@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Account extends AccountAbstract{
    private String userPassword;
    private String userName;
    private String phoneNumber;
    private MemberType memberType;
}
