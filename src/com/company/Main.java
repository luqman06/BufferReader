package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //deklarasi
        String nama, alamat;
        int usia, gaji;

        //membuat scaner baru
        Scanner keyboard = new Scanner(System.in);

        //Tampilan output ke user
        System.out.println("### Pendaftaran karayawan PT. Petani Kode ###");
        System.out.print("Nama karyawan:  ");

        //mengguanakan scaner dan menyimpan apa yang diketik di variabel
        nama = keyboard.nextLine();

        //Tampilan output lagi
        System.out.print("Alamat:  ");

        // mengunakan scaner lagi
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();


        //Menampilakn apa yang sudah simpan di variable
        System.out.println("_ _ _ _ _ _ _ _ _ _ ");
        System.out.println("Nama Karyawan: "+ nama);
        System.out.println("Alamat: "+ alamat);
        System.out.println("Usia: "+ usia + "tahun");
        System.out.println("gaji: "+ gaji);

    }




}
