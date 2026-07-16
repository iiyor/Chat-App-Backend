package com.Project.backend.Chap_App_Backend.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Room {
    @Id
    private String id;

    private String roomId;

    private String userName;



}
