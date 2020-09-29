package com.github.curriculeon.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long balance;

    @Nullable
    private Date nextPayment;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "user_id")
    private UserProfile userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Nullable
    public Date getNextPayment() {
        return nextPayment;
    }

    public void setNextPayment(@Nullable Date nextPayment) {
        this.nextPayment = nextPayment;
    }

    public UserProfile getUserId() {
        return userId;
    }

    public void setUserid(UserProfile userId) {
        this.userId = userId;
    }
}
