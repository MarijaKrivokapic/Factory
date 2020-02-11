/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Car fiat = new Car("fiat punto", 2010, 180, "black", 45, 10, 5);
        fiat.showData();
        
        Car ford = new Car( "ford", 2019, 180, "red");
        ford.showData();
        
        Car opel = new Car("corsa", 2007, 180, "BLUE", 45, 15, 6);
        opel.showData();
        
      //  System.out.println("Pocetak");
        
     //   String message = "Ovo je poruka";
        
        
        
       // Car fiat = new Car(); 
     //   fiat.model = "Fiat Punto";
      //  fiat.setModel("Fiat Punto");
     //   fiat.setBuildYear (2010);
     //   fiat.setColor ("BLACK");
     //   fiat.setConsumption(6);
      //  fiat.setCurrentFuel (20);
      //  fiat.setMaxFuel(45);
    //     fiat.setMaxSpeed (200);
       
      //  fiat.buildYear = 2010;
      //  fiat.color = "black";
      //  fiat.consumption = 6;
      //  fiat.maxSpeed = 180;
      //  fiat.currentFuel = 20;

        
       // System.out.println("Model: " + fiat.model);
       // System.out.println("Model: " + fiat.buildYear);
       // System.out.println("Model: " + fiat.color);
      //  System.out.println("Model: " + fiat.consumption);
     //   System.out.println("Model: " + fiat.maxSpeed);
      //  System.out.println("Model: " + fiat.currentFuel);
      //  System.out.println("Model: " + fiat.maxFuel);
        
 //       fiat.showData();
        
  //      Car ford = new Car();
        //ford.model = "Ford Fiesta";
  //      ford.setModel("Ford Fiesta");
        // ford.buildYear = 2015;
        
  //      ford.showData();
        
     //   System.out.println("Model: " + ford.model);
      //  System.out.println("Godina proizvodnje " + ford.buildYear);
        
     //   System.out.println("Maksimalna brzina: " + ford.maxSpeed);
     //   ford.maxSpeed = 200;
     //   System.out.println("Maksimalna brzina " + ford.maxSpeed);
     
   //  System.out.println("Model:" + ford.getModel());
     
     
        
    }
    
}
