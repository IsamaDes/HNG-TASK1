package com.example.HNG_TASK1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
    private String client_ip;
    private String location;
    private String greeting;
}
