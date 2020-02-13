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
    private double mileage;
    private int passengers;
    private int maxPassinger;
    
    
   public Car() { 
       this.model = "";
       this.buildYear = 0;
       this.maxSpeed = 0;
       this.color = "";
       this.maxFuel = 0;
       this. currentFuel = 0;
       this.consumption = 0;
       this.mileage = 0;
       this.passengers = 1;
       this.maxPassinger = 0;
      
   }
   
   public Car (String customModel, int customBuildYear, int customMaxSpeed,
               String customColor){
       this.model = customModel;
       this.buildYear = customBuildYear;
       this.maxSpeed = customMaxSpeed;
       this.color = customColor;  
   }
   
   public Car (String customModel, int customBuildYear, int customMaxSpeed,
               String customColor, int customMaxFuel, int customCurrentFuel, 
               int customConsumption, double customMileage, int customMaxPassinger){
       this.model = customModel;
       this.buildYear = customBuildYear;
       this.maxSpeed = customMaxSpeed;
       this.color = customColor;  
       this.currentFuel = customCurrentFuel;
       this.maxFuel = customMaxFuel;
       this.consumption = customConsumption;
       this.mileage = customMileage;
       this.maxPassinger = customMaxPassinger;
       
   }

    Car(String fiat_punto, int i, int i0, String black, int i1, int i2, int i3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       
       public double getMileage(){
           return this.mileage;
       }
       
       public void setMileage ( double customMileage){
           this.mileage = customMileage;
       }
       
      
       public int getMaxPassinger(){
           return this.maxPassinger;
       }
       
       public void setMaxPassinger (int customMaxPassinger){
           this.maxPassinger = customMaxPassinger;
       }
       
       public int getPassengers (){
           return this.passengers;
       }
       
       public void setPassengers ( int customPassangers){
           this.passengers = customPassangers;
       }
       
        
    public void showData(){
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje " + this.getBuildYear());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Porosnja: " + this.getConsumption());
        System.out.println("Stanje rezervoara: " + this.getCurrentFuel());
        System.out.println("Kapacitet rezervoara je: " + this.getMaxFuel());
        System.out.println( "Predjena kilometraza je:" + this.getMileage());
        
        System.out.println();
        
    }
    
    public void travel(int distance){
        if (this.getCurrentFuel() > (distance * this.getConsumption ())/100){
        
        this.mileage = this.getMileage() + distance;
        this.currentFuel = this.getCurrentFuel() - (distance * this.getCurrentFuel())/100;
        } else {
            System.out.println( "Nema dovoljno goriva za put od:" + distance);
        }
    }
    
    public void fuelUp (int refill) {
            
        this.currentFuel = this.getCurrentFuel() + refill;
            
            System.out.println ( " Sipano je dodatno goriva:" + refill);
        }
      
    public void currentFuelState (int fuelState) {
       if (this.getCurrentFuel() < this.getMaxFuel()) {
        this.currentFuel = this.getCurrentFuel() + fuelState;
       
       System.out.println( "Sispano je goriva" + fuelState);
    } else { 
    
        System.out.println( "Rezervoar je pun!");
}
       
    /**
     *
     */
   // public void getIn () {
     //      if (this.getPassengers() + 1 <= this.getMaxPassinger()){
               this.setPassengers (this.getPassengers () + 1);
    //           System.out.println ("Jedna osoba je usla u auto. N ovo stanje je: " + this.getPassengers ());
   //        } else {
    //           System.out.println ( "AUtomobil je pun. Nema mesta za jos jednog putnika");
     //      }
       }
//
    }
    
        
        //definisati novi atribut mileage
        //napraviti get i set metodu
        //prosiriti jeda konstruktor da moze da se setuje i mileage
        
        
        //kolicina goriva da se smanji za onoliko koliko je potro[eno
        //kilometraza treba da se uvecana
        
        //opciono: novi atribut za stanje motora, da li je automobil ukjucen
    
   
 
    

