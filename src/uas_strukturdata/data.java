/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_strukturdata;

/**
 *
 * @author Revaldi
 */
public class data {
    public int data;
    public String nama;
    public long nim;
    public String prodi;
    public String fakultas;
    public data(String nama,long nim,int data,String prodi,String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.data = data;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
    public int getKey(){
        return data;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }
    public String getFakultas(){
        return fakultas;
    }
    public long getNIM(){
        return nim;
    }
    public void dipslay(){
        System.out.print("\tNama : "+nama);
        System.out.print(", NIM : " + nim);
        System.out.print(", Prodi : " +prodi);
        System.out.println(", Fakultas : " +fakultas);
    }
}
