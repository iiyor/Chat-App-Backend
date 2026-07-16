package com.Project.backend.Chap_App_Backend.Repository;

import com.Project.backend.Chap_App_Backend.Entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room,String> {

    Room findByRoomId(String roomId);
}
