package com.layouts;

import com.controllers.DbControllers;

import java.util.Scanner;

public class InsertData {
    public static void insertData() {
        String namaBaru;
        long hargaBaru;
        int jumlahBaru;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama  : ");
        namaBaru = input.nextLine();

        System.out.print("Harga : ");
        hargaBaru = input.nextLong();

        System.out.print("Jumlah : ");
        jumlahBaru = input.nextInt();

        DbControllers.insertData(namaBaru, hargaBaru, jumlahBaru);
    } 
}