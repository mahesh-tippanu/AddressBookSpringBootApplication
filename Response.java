package com.example.AddressBookApplication.responce;

import com.example.AddressBookApplication.model.AddressBookModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class Response
{
    private HttpStatus code;
    private AddressBookModel data;
    private String message;

}
