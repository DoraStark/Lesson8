public class Burger {

        public String bun;
        public String meat;

        public boolean doubleMeat;
        public String cheese;

        public String green;

        public boolean mayo;


        public Burger(String bun, String meat, String cheese, String green, boolean mayo) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.green = green;
            this.mayo =mayo;
            if (!mayo) {
                System.out.println("Склад бургеру \"Дієтичний\": Булочка " + bun + ", " + meat + ", сир " + cheese + ", " + green + ". ");
            }
            else{
                System.out.println("Склад бургеру \"Звичайний\": Булочка " + bun + ", " + meat + ", сир " + cheese + ", " + green + ", Майонез" + ". ");
            }
        }


        public Burger(String bun, String meat, String cheese, String green) {
            this.bun = bun;
            this.meat = meat;
            this.cheese = cheese;
            this.green = green;
            System.out.println("Склад бургеру \"Дієтичний\": Булочка " + bun + ", " + meat + ", сир " + cheese + ", " + green + ". ");
        }

        public Burger(String bun, String meat, boolean doubleMeat, String cheese, String green, boolean mayo) {
            this.bun = bun;
            this.meat = meat;
            this.doubleMeat=doubleMeat;
            this.cheese = cheese;
            this.green = green;
            this.mayo =mayo;

            if(!doubleMeat){
                System.out.println("Склад бургеру \"Звичайний\": Булочка " + bun + ", " + meat + ", cир " + cheese + ", " + green + ", Майонез. ");
            }
            else {
                System.out.println("Склад бургеру \"Double звичайний\": Булочка " + bun + ", " + meat + "X2, сир " + cheese + ", " + green + ", Майонез.");
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












