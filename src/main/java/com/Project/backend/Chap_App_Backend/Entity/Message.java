package com.Project.backend.Chap_App_Backend.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document
public class Message {

   @Id
   private String id;
   private String roomId;
    private String content;
    private String sender;
    private LocalDateTime sendAt;
}
