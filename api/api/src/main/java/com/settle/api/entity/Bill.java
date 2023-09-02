package com.settle.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bills")
public class Bill {
    
    @Id
    @Column(name = "Bill")
    private String billCode;

    @Column(name = "Store")
    private int store;

    @Column(name = "Date")
    private String date;

    @Column(name = "Payer")
    private int payerId;

    @Column(name = "BillInvolved")
    private int[] billParticipantIds;


    public Bill() {
    }


    public Bill(String billCode, int store, String date, int payerId, int[] billParticipantIds) {
        this.billCode = billCode;
        this.store = store;
        this.date = date;
        this.payerId = payerId;
        this.billParticipantIds = billParticipantIds;
    }


    public String getBillCode() {
        return this.billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public int getStore() {
        return this.store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPayerId() {
        return this.payerId;
    }

    public void setPayerId(int payerId) {
        this.payerId = payerId;
    }

    public int[] getBillParticipantIds() {
        return this.billParticipantIds;
    }

    public void setBillParticipantIds(int[] billParticipantIds) {
        this.billParticipantIds = billParticipantIds;
    }


    @Override
    public String toString() {
        return "{" +
            " billCode='" + getBillCode() + "'" +
            ", store='" + getStore() + "'" +
            ", date='" + getDate() + "'" +
            ", payerId='" + getPayerId() + "'" +
            ", billParticipantIds='" + getBillParticipantIds() + "'" +
            "}";
    }




}
