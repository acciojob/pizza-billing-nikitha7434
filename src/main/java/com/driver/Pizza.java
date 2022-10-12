package com.driver;

public class Pizza {

   private boolean istake;
   private boolean isaddchess;
   private boolean istapping;
   private boolean isgetbill;

   private int isetrechessprice;
   private int isextraTappingprice;
   private int bagprice;

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){

        this.istake=false;
        this.isaddchess=false;
        this.istapping=false;
        this.isgetbill=false;
        this.isVeg = isVeg;
        this.isetrechessprice=80;
        this.bagprice=20;

        // your code goes here
        if(isVeg){
             this.price=300;
            this.isextraTappingprice=70;

         }
        else{
           this.price =400;
           this.isextraTappingprice=120;
        }

        bill = "Base Price Of The Pizza : " + this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isaddchess) {
            this.price = this.price+this.isetrechessprice;
            isaddchess=true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!istapping) {
            this.price=this.price+this.isextraTappingprice;
            istapping=true;
        }

    }

    public void addTakeaway() {
        // your code goes here
        if (!istake) {
            this.price=this.price+this.bagprice;
            istake = true;
        }
    }
    public String getBill(){
        // your code goes here


            if(!isgetbill) {

                if (isaddchess) {
                    bill += "Extra Cheese Added: "+this.isetrechessprice+"\n";
                }
                if (istapping) {
                    bill += "Extra Toppings Added: "+this.isextraTappingprice+"\n";
                }

                if (istake) {
                    bill += "Paperbag Added: "+this.bagprice+"\n";
                }
                bill += "Total Price: " +this.price+"\n";

                isgetbill=true;
            }


            return this.bill;

    }
}
