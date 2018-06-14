package products.pizza;

import java.util.*;


import products.pizza.ingredients.Ingredients;

import java.util.HashMap;


public class Pizza {


    private String name;
    private String size="";
    private double baseCost=0;
    private double cost=0;
    private int spiceLVL=0;
    protected HashMap<String,Ingredients> ingredients=new HashMap<>();

    public Pizza(String name){
        this.name=name;
    }

    public Pizza(String name, Ingredients... ingredients){
        this.name=name;
        for (Ingredients it:ingredients)
        addIngredients(it);
    }
    //------ADDING INGREDIENTS---------------------
    public Pizza addIngredients(Ingredients ingredient){

            if(ingredient!=null){
                if(this.ingredients.containsKey(ingredient.getName()))
                    this.ingredients.get(ingredient.getName()).addQuantity(1);
                else
                    this.ingredients.put(ingredient.getName(),ingredient);
            }
            return this;
        }


    //------CALCULATING PRICE AND SPICE LVL-----------------
    public void calculateIngredients(){
        this.spiceLVL=0;
        this.cost =this.baseCost;
            for (Map.Entry<String,Ingredients> m : ingredients.entrySet()){
                if(this.spiceLVL<10){
                    this.spiceLVL+=m.getValue().getSpiceLVL()*m.getValue().getQuantity();
                    if(this.spiceLVL>10)
                        this.spiceLVL=10;
                }
                this.cost +=m.getValue().getPrice()*m.getValue().getQuantity();
            }
        }
    //----------------------TO STRING-------------------------

    @Override
    public String toString() {

        String string = size+" "+name+" | "+"Base cost: "+ baseCost+"\nIngredients: "
                + ingredients+" SpiceLVL: "+spiceLVL+"\nPIZZA COST: "+ cost;
        return string;
    }

    //----------------------GETTERS/SETTERS-------------------------


    public String getName() {
        return name;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }


    public HashMap<String, Ingredients> getIngredients() {
        return ingredients;
    }


    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setName(String name) {

        this.name = name;

    }



}
