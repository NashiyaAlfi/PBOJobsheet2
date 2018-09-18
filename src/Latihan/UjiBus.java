/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author ONE
 */
public class UjiBus {
    public static void main (String [] args){
        //membuat objek busMini dari kelas Bus
        Bus busMini = new Bus();
        //memasukkan nilai jumlah peniumpang dan penumpang maksimal ke dalam objek bus mini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memangnggil method cetak pada kelas bus 
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //memanggil method cetak pada kelas bus 
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada bus mini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada bus mini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
   
        
    }



    
