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
public class Car {
    private final String vehicleType = "car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    
   public Car() { 
       this.model = "";
       this.buildYear = 0;
       this.maxSpeed = 0;
       this.color = "";
       this.maxFuel = 0;
       this. currentFuel = 0;
       this.consumption = 0;
   }
   
   public Car (String customModel, int customBuildYear, int customMaxSpeed,
               String customColor){
       this.model = customModel;
       this.buildYear = customBuildYear;
       this.maxSpeed = customMaxSpeed;
       this.color = customColor;  
   }
   
   public Car (String customModel, int customBuildYear, int customMaxSpeed,
               String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption){
       this.model = customModel;
       this.buildYear = customBuildYear;
       this.maxSpeed = customMaxSpeed;
       this.color = customColor;  
       this.currentFuel = customCurrentFuel;
       this.maxFuel = customMaxFuel;
       this.consumption = customConsumption;
   }
   
   public String getModel() {
       return this.model;
   }
   
   public void setModel(String customModel) {
       this.model = customModel;
   }
   
      public int getBuildYear(){
          return this.buildYear;
      }
      
      public void setBuildYear( int customBuildYear){
          this.buildYear = customBuildYear;
      }
      
      public int getMaxSpeed(){
          return this.maxSpeed;
      }
      
      public void setMaxSpeed ( int customMaxSpeed){
          this.maxSpeed = customMaxSpeed;
      }
      
      public String getColor(){
          return this.color;
      }
    
      public void setColor (String customColor){
          this.color = customColor;
      }
       public int getMaxFuel(){
           return this.maxFuel;
       }
       
       public void setMaxFuel (int customMaxFuel){
           this.maxFuel = customMaxFuel;
       }
       
       public int getCurrentFuel(){
           return this.currentFuel;
       }
       
       public void setCurrentFuel (int customCurrentFuel){
           this.currentFuel = customCurrentFuel;
       }
    
       
       
       public int getConsumption(){
           return this.consumption;
       }
       
       public void setConsumption (int customConsumption){
           this.consumption = customConsumption;
       }
     
       public String getVehicalType(){
           return this.vehicleType;
       }
        
        
    public void showData(){
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Porosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara je: " + this.getMaxFuel());
        System.out.println();
        
    }
    
    public void travel(int distanceTraveled){
        //definisati novi atribut mileage
        //napraviti get i set metodu
        //prosiriti jeda konstruktor da moze da se setuje i mileage
        
        
        //kolicina goriva da se smanji za onoliko koliko je potro[eno
        //kilometraza treba da se uvecana
        
        //opciono: novi atribut za stanje motora, da li je automobil ukjucen
    }
 
    
}
