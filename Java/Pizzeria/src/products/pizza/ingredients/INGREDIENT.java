package products.pizza.ingredients;

public enum INGREDIENT {
    CHEESE{

        public Ingredients getIngredient(){
            return new Ingredients("Cheese",1,4.0,0);
        }
    },
    CHICKEN{
        public Ingredients getIngredient(){
            return new Ingredients("Cheese",1,6.0,0);

        }
    },
    JALAPENO{
        public Ingredients getIngredient(){
            return new Ingredients("Jalapeno",1,7.0,4);

        }
    },
    SALAMI{
        public Ingredients getIngredient(){
            return new Ingredients("Salami",1,6.0,2);

        }
    },
    HAM{
        public Ingredients getIngredient(){
            return new Ingredients("Ham",1,4.0,0);

        }
    },
    PINAPPLE{
        public Ingredients getIngredient(){
            return new Ingredients("Pineapple",1,4.0,0);

        }
    };
    public abstract Ingredients getIngredient();

}
