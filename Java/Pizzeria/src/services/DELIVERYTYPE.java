package services;

public enum DELIVERYTYPE {
    SELF_PICKUP{
        public double getCost(){
            return 0;
        }
    },
    HOME_DELIVERY{
        public double getCost(){
            return 10.00;
        }
    };
    public abstract double getCost();
}
