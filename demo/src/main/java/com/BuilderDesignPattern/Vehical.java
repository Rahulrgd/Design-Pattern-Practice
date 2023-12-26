package com.BuilderDesignPattern;

class Vehical {

  private int wheels;
  private String engine;
  private int airBags;

  public Vehical(VehicalBuiler vehicalBuiler) {
    this.wheels = vehicalBuiler.wheels;
    this.engine = vehicalBuiler.engine;
    this.airBags = vehicalBuiler.airBags;
  }

  public int getWheels() {
    return wheels;
  }

  public String getEngine() {
    return engine;
  }

  public int getAirBags() {
    return airBags;
  }

  public static class VehicalBuiler {

    public String engine;
    public int wheels;
    public int airBags;

    public VehicalBuiler(String engine, int wheels) {
      this.engine = engine;
      this.wheels = wheels;
    }

    public VehicalBuiler setAirBags(int bags) {
      this.airBags = bags;
      return this;
    }

    public Vehical build() {
      return new Vehical(this);
    }
  }
}
class Driver {
    public static void main(String[] args) {
        Vehical car = new Vehical.VehicalBuiler("2000cc", 4).setAirBags(4).build();
        
        System.out.println(car.getEngine());
        System.out.println(car.getAirBags());
        System.out.println(car.getWheels());
    }
}
