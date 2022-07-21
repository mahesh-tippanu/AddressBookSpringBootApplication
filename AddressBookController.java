package com.example.AddressBookApplication.controller;

import com.example.AddressBookApplication.Dto.AddressBookDto;
import com.example.AddressBookApplication.responce.Response;
import com.example.AddressBookApplication.services.AddressBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
@Autowired
AddressBookService addressBookService;
@PostMapping("/Ab")
public ResponseEntity<Response> saveaddress(@RequestBody AddressBookDto addressBookDto){
  Response response  = addressBookService.saveAddress(addressBookDto);
    return new ResponseEntity<>(response,response.getCode());
}
}
