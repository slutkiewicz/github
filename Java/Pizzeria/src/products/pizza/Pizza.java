package products.pizza;

import java.util.*;

import products.AbstractProduct;
import products.pizza.ingredients.INGREDIENT;
import products.pizza.ingredients.Ingredients;

import java.util.HashMap;

public class Pizza extends AbstractProduct {
    protected String name;
    protected SIZE size;
    protected double baseCost;
    protected double cost;
    protected int spiceLVL=0;
    protected HashMap<INGREDIENT,Ingredients> ingredients=new HashMap<INGREDIENT,Ingredients>();

    public Pizza(String name){
        this.name=name;

    }

    public Pizza(String name, INGREDIENT... ingredients){
        this.name=name;
        addIngredients(ingredients);
    }

    public  void addIngredients(INGREDIENT... ingredient){
        for (INGREDIENT it : ingredient){
            if(it!=null){
                if(this.ingredients.containsKey(it))
                    this.ingredients.get(it).addQuantity(1);
                else
                    this.ingredients.put(it,it.getIngredient());
            }
        }
    }
    public void calculateIngredients(){
        this.cost =this.baseCost;
            for (Map.Entry<INGREDIENT,Ingredients> m : ingredients.entrySet()){
                if(this.spiceLVL<10){
                    this.spiceLVL+=m.getValue().getSpiceLVL();
                    if(this.spiceLVL>10)
                        this.spiceLVL=10;
                }
                this.cost +=m.getValue().getPrice()*m.getValue().getQuantity();
            }
        }
    //----------------------TO STRING-------------------------

    @Override
    public String toString() {
        String string= size+" "+name+" | "+"Base cost: "+ baseCost+"\nIngredients: "
                + ingredients+" SpiceLVL: "+spiceLVL+"\nPIZZA COST: "+ cost;
        return string;
    }
    //----------------------GETTERS/SETTERS-------------------------

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getSpiceLVL() {
        return spiceLVL;
    }

    public void setSpiceLVL(int spiceLVL) {
        this.spiceLVL = spiceLVL;
    }

    public HashMap<INGREDIENT, Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<INGREDIENT, Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public SIZE getSize() {
        return size;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;

    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public void setName(String name) {

        this.name = name;

    }



}
