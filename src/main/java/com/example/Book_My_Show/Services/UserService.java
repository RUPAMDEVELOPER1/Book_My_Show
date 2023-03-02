package com.example.Book_My_Show.Services;


import com.example.Book_My_Show.Entities.UserEntity;
import com.example.Book_My_Show.EntryDto.UserEntryDto;
import com.example.Book_My_Show.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
    UserRepository userRepository;

   public void addUser(UserEntryDto userEntryDto)
   {
       UserEntity userEntity = UserEntity.builder()
                             .age(userEntryDto.getAge())
                             .adress(userEntryDto.getAdress())
                             .name(userEntryDto.getName())
                             .email(userEntryDto.getEmail())
                             .mobNo(userEntryDto.getMobNo())
                             .build();
       userRepository.save(userEntity);


   }

}
