package com.example;


public class Persona extends Thread{
   private Cestino cesto;
   private int monete;


   public void run(){
       for (int i = 0; i < monete; i++) {
           cesto.aggiungiMoneta();
       }
   }


   public Persona(Cestino c, int m){
       this.cesto = c;
       this.monete = m;
   }
}

