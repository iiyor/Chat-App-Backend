package com.Project.backend.Chap_App_Backend.Payload;

import lombok.Data;

@Data
public class MessageRequest {

    private String sender;
    private String content;
}
