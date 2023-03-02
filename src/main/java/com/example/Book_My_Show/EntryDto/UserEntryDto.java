package com.example.Book_My_Show.EntryDto;

import com.example.Book_My_Show.Entities.UserEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEntryDto {
    private String name;

    private int age;
    private String mobNo;

    private String adress;

    private String email;



}
