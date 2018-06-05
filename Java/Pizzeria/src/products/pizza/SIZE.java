package products.pizza;

public enum SIZE {
    SMALL{
        public double getCost(){
            return 10.00;
        }
    },
    MEDIUM{
        public double getCost(){
            return 20.00;
        }
    },
    LARGE{
        public double getCost(){
            return 30.00;
        }
    },
    XLARGE{
        public double getCost(){
            return 40.00;
        }
    };
    public abstract double getCost();
}
