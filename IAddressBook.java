package com.example.AddressBookApplication.repositroy;

import com.example.AddressBookApplication.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressBook extends JpaRepository <AddressBookModel,Long>{
}
