package com.edutyback.edutybackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String lot_name;
    private String batch_date;
    private String batch_time;
    private String total_docs;
    private String total_duty;
    private String total_dub;
    private String total_payment;
    private String ref1;
    private String ref2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLot_name() {
        return lot_name;
    }

    public void setLot_name(String lot_name) {
        this.lot_name = lot_name;
    }

    public String getBatch_date() {
        return batch_date;
    }

    public void setBatch_date(String batch_date) {
        this.batch_date = batch_date;
    }

    public String getBatch_time() {
        return batch_time;
    }

    public void setBatch_time(String batch_time) {
        this.batch_time = batch_time;
    }

    public String getTotal_docs() {
        return total_docs;
    }

    public void setTotal_docs(String total_docs) {
        this.total_docs = total_docs;
    }

    public String getTotal_duty() {
        return total_duty;
    }

    public void setTotal_duty(String total_duty) {
        this.total_duty = total_duty;
    }

    public String getTotal_dub() {
        return total_dub;
    }

    public void setTotal_dub(String total_dub) {
        this.total_dub = total_dub;
    }

    public String getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(String total_payment) {
        this.total_payment = total_payment;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }
}
