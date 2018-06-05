package products.drinks;

public enum TYPE {
    COLA{
        @Override
        public Drink getDrink() {
            return new Drink("Cola",2.50);
        }
    },
    FANTA{
        @Override
        public Drink getDrink() {
            return new Drink("Fanta",2.50);
        }
    },
    WATER{
        @Override
        public Drink getDrink() {
            return new Drink("Water",2.00);
        }
    },
    ORANGEJUICE{
        @Override
        public Drink getDrink() {
            return new Drink("Orange Juice",2.50);
        }
    };
    public abstract Drink getDrink();
}
