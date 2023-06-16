package com.layouts;

import java.util.Scanner;

import com.controllers.DbControllers;

public class DeleteData {
    public static void deleteData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID yang ingin dihapus  : ");
        int inputId = input.nextInt();

        DbControllers.deleteData(inputId);
    }
}
