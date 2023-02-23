/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_strukturdata;

import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author Revaldi
 */
public class HashTable  {
    public data[] hashArray;
    public int size;
    public int index = 0;
    public int percobaan = 0;
   
    

    public HashTable(int sizeVal) {
        this.size = sizeVal;
        hashArray = new data[size];
        
    }
    public void displayTable() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                sb.append(" | ").append(j).append("\t | ").append("-- | ").append(hashArray[j].getNama()).append(" |\n");
            } else {
                sb.append(" | ").append(j).append("\t | -- |\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb);
    }
    public void TurnNull(){
        for(int i=0;i<size;i++){
            hashArray[i] = null;
        }
        displayTable();
    }

    public void displayHasil(){
        for (int i=0;i<size;i++){
            System.out.print("\tNama : "+getDataNama(i));
            System.out.print(", NIM : " + getDataNim(i));
            System.out.print(", Prodi : " +getDataProdi(i));
            System.out.println(", Fakultas : " +getDataFakultas(i));
        }
    }
    
    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(String nama,long nim,int data,String prodi,String fakultas) {
        data item= new data(nama,nim,data,prodi,fakultas);
        int key = item.getKey();
        int hashVal = hashFunc(key);

        while (hashArray[hashVal] != null ) {

            ++hashVal;
            hashVal %= size;

        }
        hashArray[hashVal] = item;
    }
    public data delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }
    public data find(int key) {
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey()
                    == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }
    public String getDataNama(int i){
        return hashArray[i].getNama();
    }
    public long getDataNim(int i){
        return hashArray[i].getNIM();
    }
    public String getDataProdi(int i){
        return hashArray[i].getProdi();
    }
    public String getDataFakultas(int i){
        return hashArray[i].getFakultas();
    }
    public boolean empty(int i){
        if (hashArray[i]  == null){
            return true;
        }
        return false;
    }
    
    
    
     public void displayQuick() {
        for (int i = 0; i < size; i++){
            if(hashArray[i]==null){
                hashArray[i] = null;
            } else {
                System.out.println(hashArray[i].getNIM() + " " + hashArray[i].getNama());
            }
            
        }
            
        System.out.println();
    }

    // quick sort NIM
    public void quickSortNim() {
        recQuickSortNim(0, size-1);
    }

    // quick sort NAMA
    public void quickSortNama() {
        recQuickSortNama(0, size - 1);
    }

    // rec quick sort NIM
    private void recQuickSortNim(int left, int right) {
        if (right - left <= 0)
            return;
        else {
            long pivot = hashArray[right].getNIM();
            int partisi = partitionNim(left, right, pivot);
            recQuickSortNim(left, partisi - 1);
            recQuickSortNim(partisi, right);
        }
    }

    // recQUickSort NAMA
    private void recQuickSortNama(int left, int right) {
        if (right - left <= 0)
            return;
        else {
            String pivot = hashArray[right].getNama();
            int partisi = partitionNama(left, right, pivot);
            recQuickSortNama(left, partisi - 1);
            recQuickSortNama(partisi, right);
        }
    }

    private void swap(int left, int right) {
        data temp = hashArray[left];
        hashArray[left] = hashArray[right];
        hashArray[right] = temp;
    }

    // partition NIM
    private int partitionNim(int left, int right, long pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && hashArray[++leftPtr].getNIM() < pivot) ;
            while (rightPtr > left && hashArray[--rightPtr].getNIM() > pivot) ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }

        }
        return leftPtr;
    }

    // partition NAMA
    private int partitionNama(int left, int right, String pivot) {
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while (true) {
            while (leftPtr < right && hashArray[++leftPtr].getNama().compareTo(pivot) < 0) ;
            while (rightPtr > left && hashArray[--rightPtr].getNama().compareTo(pivot) > 0) ;
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }

        }
        return leftPtr;
    }
    
    //untuk binary
    public int binary_search(String x){
        
        if(percobaan==0){
           quickSortNama();
        }
        percobaan++;
        int low = 0;
        int high = hashArray.length;
        int mid;
        
            while (low <= high) {
            mid = (low + high) / 2;

            if (hashArray[mid].getNama().compareTo(x) < 0) {
                low = mid + 1;
            } else if (hashArray[mid].getNama().compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
                
            }
        }
        
        
        return -1;
    }
    
}

//class Data {
//    public int data;
//    public String nama;
//    public long nim;
//    public String prodi;
//    public String fakultas;
//    public Data(String nama,long nim,int data,String prodi,String fakultas) {
//        this.nama = nama;
//        this.nim = nim;
//        this.data = data;
//        this.prodi = prodi;
//        this.fakultas = fakultas;
//    }
//    public int getKey(){
//        return data;
//    }
//    public String getNama(){
//        return nama;
//    }
//    public String getProdi(){
//        return prodi;
//    }
//    public String getFakultas(){
//        return fakultas;
//    }
//    public long getNIM(){
//        return nim;
//    }
//    public void dipslay(){
//        System.out.print("\tNama : "+nama);
//        System.out.print(", NIM : " + nim);
//        System.out.print(", Prodi : " +prodi);
//        System.out.println(", Fakultas : " +fakultas);
//    }
//
//  
//}
