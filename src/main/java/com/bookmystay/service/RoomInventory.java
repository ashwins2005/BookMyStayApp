package com.bookmystay.service;

import com.bookmystay.model.Room;
import java.util.ArrayList;

public class RoomInventory {

    ArrayList<Room> rooms = new ArrayList<>();

    public RoomInventory() {

        rooms.add(new Room(101, "Single", true));
        rooms.add(new Room(102, "Double", true));
        rooms.add(new Room(103, "Deluxe", false));

    }

    public void showAvailableRooms() {

        System.out.println("\nAvailable Rooms:");

        for (Room room : rooms) {

            if (room.isAvailable()) {

                System.out.println(
                        "Room ID: " + room.getRoomId() +
                                " | Type: " + room.getType()
                );

            }

        }

    }

    public void requestBooking(int roomId) {

        for (Room room : rooms) {

            if (room.getRoomId() == roomId) {

                if (room.isAvailable()) {

                    room.setAvailable(false);

                    System.out.println("\nReservation Confirmed!");
                    System.out.println("Room " + roomId + " has been allocated.");

                } else {

                    System.out.println("\nRoom " + roomId + " is not available.");

                }

                return;
            }

        }

        System.out.println("\nRoom not found.");
    }
}