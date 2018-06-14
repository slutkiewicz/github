package products.pizza;


public enum TYPE {

    HAWAII{
        public String getName(){
            return "Hawaii";
        }
    },
    MARGARITA{
        public String getName(){
            return"Margarita";
        }
    },
    PEPERONI{
        public String getName(){
            return "Peperoni";
        }
    },
    RAW{
        public String getName(){
            return"Unique";
        }
    };
    public abstract String getName();
}
