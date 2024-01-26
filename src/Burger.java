public class Burger {

        public String base;
        public String meat;

        public boolean doubleMeat;
        public String cheese;

        public String green;

        public String mayo;


        public Burger() {
            base = "Пшенична";
            meat = "Свинина";
            cheese = "Чеддар";
            green = "Зелень";
            mayo = "Майонез";
            System.out.println("Склад бургеру \"Звичайний\": Булочка " + base + ", " + meat + ", сир " + cheese + ", " + green + ", " + mayo+ ". ");
        }


        public Burger(String base, String meat, String cheese, String green) {
            this.base = base;
            this.meat = meat;
            this.cheese = cheese;
            this.green = green;
            System.out.println("Склад бургеру \"Дієтичний\": Булочка " + base + ", " + meat + ", сир " + cheese + ", " + green + ". ");
        }

        public Burger(boolean doubleMeat) {
            base = "Пшенична";
            meat = "Свинина";
            cheese = "Чеддар";
            green = "Зелень";
            mayo = "Майонез";
            if(!doubleMeat){
                System.out.println("Склад бургеру \"Звичайний\": Булочка " + base + ", " + meat + ", cир " + cheese + ", " + green + ". ");
            }
            else {
                System.out.println("Склад бургеру \"Double звичайний\": Булочка " + base + ", " + meat + "X2, сир " + cheese + ", " + green + ", " + mayo + ". ");
            }
        }


//    public Burger(String base, String meat, boolean doubleMeat, String cheese, String green) {
//        this.base = base;
//        this.meat = meat;
//        this.doubleMeat = doubleMeat;
//        this.cheese = cheese;
//        this.green = green;
//        System.out.println("Склад бургеру \"Double\": Булочка " + base + ", " + meat + "X2," + cheese + ", " + green + ", " + mayo + ". ");
//    }

    }












