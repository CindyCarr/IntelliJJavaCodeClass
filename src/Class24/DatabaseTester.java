package Class24;

import Class23.WebDriver;

public class DatabaseTester {
    public static void main(String[] args) {
        Database [] databases={new Informix(), new MySQLServer()};

        for (Database database:databases){
            database.open();
            database.readData();
            database.writeData();
            database.closeTheDatabase();


        }


    }
}
