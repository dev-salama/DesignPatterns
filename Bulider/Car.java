/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bulider;

/**
 *
 * @author A
 */
public class Car {
    private String model;
    private String color;
    private String country;
    private float price;
    private float speed;
    private int year;

    private Car(String model, String color, String country, float price, float speed, int year) {
        this.model = model;
        this.color = color;
        this.country = country;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
    public static class Bulider{
        private String model;
        private String color;
        private String country;
        private float price;
        private float speed;
        private int year;

        /**
         * @param model the model to set
         */
        public void setModel(String model) {
            this.model = model;
        }

        /**
         * @param color the color to set
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * @param country the country to set
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         * @param price the price to set
         */
        public void setPrice(float price) {
            this.price = price;
        }

        /**
         * @param speed the speed to set
         */
        public void setSpeed(float speed) {
            this.speed = speed;
        }

        /**
         * @param year the year to set
         */
        public void setYear(int year) {
            this.year = year;
        }
        
        public Car createCar(){
            if(model == null){
                throw new IllegalArgumentException("not complete data.");
            }else{
                return new Car( model,  color,  country,  price,  speed,  year);
            }
        }
        
        

    
    }
}
