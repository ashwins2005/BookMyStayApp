package com.bookmystay;

import com.bookmystay.service.RoomInventory;
import java.util.Scanner;

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("===============================");
        System.out.println(" Welcome to Book My Stay App ");
        System.out.println("===============================");

        RoomInventory inventory = new RoomInventory();

        inventory.showAvailableRooms();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Room ID to book: ");

        int roomId = scanner.nextInt();

        inventory.requestBooking(roomId);

        scanner.close();
    }
}