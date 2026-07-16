package com.Project.backend.Chap_App_Backend.Repository;

import com.Project.backend.Chap_App_Backend.Entity.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepository extends MongoRepository<Message,String> {
    Page<Message> findByRoomId(String roomid, Pageable pageable);
}
