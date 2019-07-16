//THIS CLASS SHOULD LIST MY VARIABLES, CONSTRUCTORS,
//GETTERS AND SETTERS, AND METHODS
public class CarInventory {

        //CREATE VARIABLES
        protected String make;
        protected String model;
        protected int year;
        protected String color;
        protected int miles;

        //MUST CREATE AN EMPTY CONSTRUCTOR
        public CarInventory() { }

        //CONSTRUCTOR
        public CarInventory(String make, String model, int year, String color, int miles) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.color = color;
            this.miles = miles;
        }

        //GETTERS AND SETTERS
        public String getMake() {

            return this.make;
        }
        public void setMake(String make) {

            this.make = make;
        }
        public String getModel() {

            return this.model = model;
        }
        public void setModel(String model) {

            this.model = model;
        }
        public int getYear() {

            return this.year;
        }
        public void setYear(int year) {

            this.year = year;
        }
        public String getColor() {

            return this.color = color;
        }
        public void setColor(String color) {

            this.color = color;
        }
        public int getMiles() {

            return this.miles;
        }
        public void setMiles(int miles) {

            this.miles = miles;
        }


  }

