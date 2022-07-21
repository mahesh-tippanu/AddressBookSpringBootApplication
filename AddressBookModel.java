package com.example.AddressBookApplication.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class AddressBookModel {
@Id
@Column(name="Id", nullable=false)
private long id;
private String name;
private long phonenumber;
private String city;
private String state;
private long pincode;
private String address;
}
