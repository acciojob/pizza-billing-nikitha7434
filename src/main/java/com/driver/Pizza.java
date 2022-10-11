package com.driver;

public class Pizza {

   private boolean istake;
   private boolean isaddchess;
   private boolean istapping;
   private boolean isgetbill;

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
             this.price=300;

         }
        else{
           this.price =400;

        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isaddchess) {
            price += 80;
            isaddchess=true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (!istapping) {
            if (isVeg) {
                price += 70;
            } else {
                price += 120;
            }
        }
        istapping=true;
    }

    public void addTakeaway() {
        // your code goes here
        if (!istake) {
            price += 20;
            istake = true;
        }
    }
    public String getBill(){
        // your code goes here

            bill = "";
            if(!isgetbill) {
                if (isVeg) {
                    bill += "Base Price of The Pizza : 300\n";
                } else {
                    bill += "Base Price Of The Pizza: 400\n";
                }
                if (isaddchess) {
                    bill += "Extra Cheese Added: 80\n";
                }
                if (istapping) {
                    if (isVeg) {
                        bill += "Extra Toppings Added: 70\n";
                    } else {
                        bill += "Extra Toppings Added: 120\n";
                    }
                }

                if (istake) {
                    bill += "Paperbag Added: 20\n";
                }
                bill += ("Total Price:" + price);
                isgetbill=true;
            }


            return this.bill;

    }
}
