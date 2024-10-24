package com.Casinop2p.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoomResponseDTO {

    private Long id;
    private String roomName;
    private String roomOwnerName;  // Aquí solo devolvemos el nombre del propietario
    private boolean enable;
    private float bet;
    private int maxUsers;
    private boolean privateRoom;
    private String betDescription;
    private Date expirationDate;
    private Date creationDate;


}
