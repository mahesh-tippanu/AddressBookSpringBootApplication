package com.example.AddressBookApplication.services;


import com.example.AddressBookApplication.Dto.AddressBookDto;
import com.example.AddressBookApplication.model.AddressBookModel;
import com.example.AddressBookApplication.repositroy.IAddressBook;
import com.example.AddressBookApplication.responce.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class AddressBookService {


    @Autowired
    IAddressBook iAddressBook;

    @Autowired
    ModelMapper modelMapper;

    public Response saveAddress(AddressBookDto addressBookDto) {
    AddressBookModel address = modelMapper.map(addressBookDto,AddressBookModel.class);
     iAddressBook.save(address);
     return new Response(HttpStatus.OK,address,"AddressBook saved successfully");
    }

}
