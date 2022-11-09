public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(2005, "Blue", "Mechanics");
        toyota.print();
        Lexus lexus = new Lexus(2001, "WHite", "Engine: Diesel");
        lexus.print();
        Mercedes mercedes = new Mercedes(2006, "Brown", "Left Side");
        mercedes.print();

        createObjects("Mercedes");
        createObjects("Toyota");
        createObjects("Lexus");

    }

    public static String createObjects(String className){
        Toyota toyota = new Toyota(2010,"Yellow","Automate");
        Mercedes mercedes  = new Mercedes(2005,"Black","Right Side");
        Lexus lexus = new Lexus(2015,"Yellow","Diesele");
        if (className == "Toyota"){
            toyota.print();

        } else if (className == "Mercedes") {
            mercedes.print();
        } else if (className == "Lexus") {
            lexus.print();
        }
        return className;
    }

}
