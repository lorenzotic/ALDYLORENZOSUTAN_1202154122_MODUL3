package com.example.android.aldy_lorenzo_sutan_1202154122_modul3;

/**
 * Created by ASUS on 2/25/2018.
 */

public class menulist {

    //deklarasi variable yang akan digunakan

    int gambar;

    String nama;

    String desc;



    //method setter

    public menulist(int gambar, String nama, String desc){

        this.gambar=gambar;

        this.nama=nama;

        this.desc=desc;

    }



    //method getter untuk get gambar

    public int getGambar() {

        return gambar;

    }



    //method getter untuk get nama

    public String getNama() {

        return nama;

    }



    //method getter untuk get detail

    public String getDesc() {

        return desc;

    }



}
