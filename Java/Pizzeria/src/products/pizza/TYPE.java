package products.pizza;

import products.pizza.ingredients.INGREDIENT;

public enum TYPE {

    HAWAII{
        public Pizza getPizza(){
            return new Pizza("Hawaii",
                    INGREDIENT.PINAPPLE,INGREDIENT.HAM,INGREDIENT.CHEESE);
        }
    },
    MARGARITA{
        public Pizza getPizza(){
            return new Pizza("Margarita",INGREDIENT.CHEESE);
        }
    },
    PEPERONI{
        public Pizza getPizza(){
            return new Pizza("Peperoni",
                    INGREDIENT.SALAMI,INGREDIENT.JALAPENO,INGREDIENT.CHEESE);
        }
    },
    RAW{
        public Pizza getPizza(){
            return new Pizza("Unique");
        }
    };
    public abstract Pizza getPizza();
}
