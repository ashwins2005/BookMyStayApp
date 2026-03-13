package com.bookmystay.model;

public class Room {

    private int roomId;
    private String type;
    private boolean available;

    public Room(int roomId, String type, boolean available) {
        this.roomId = roomId;
        this.type = type;
        this.available = available;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}