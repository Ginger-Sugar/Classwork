package VendingMachine.Dao;

import VendingMachine.Dto.Drinks;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Shantoria Taylor *
 */
public class VMDaoImpl implements VMDao {

    private Map<String, Drinks> drinks;
    public final String DRINKS_FILE;
    public static final String DELIMITER = ":%:";

    public VMDaoImpl() {
        DRINKS_FILE = "drinksFile.txt";
        this.drinks = new HashMap<>();
    }

    public VMDaoImpl(String file) {
        this.DRINKS_FILE = file;
        this.drinks = new HashMap<>();
    }

    @Override
    public List<Drinks> getDrinks() throws VMPersistenceException {
        read();
        List<Drinks> testDrinks = new ArrayList<>(drinks.values());
        return testDrinks;
    }

    @Override
    public Drinks buyDrinks(String name) throws VMPersistenceException {
        read();
        Drinks aname = drinks.get(name);
        return aname;

    }

    private String marshalling(Drinks drinks) {

        String drinkAsText = (drinks.getName() + DELIMITER + Double.toString(drinks.getPrice()) + DELIMITER + Integer.toString(drinks.getQuantity()));
        return drinkAsText;

    }

    private Drinks unmarshalling(String drinkAsText) throws VMPersistenceException {

        String[] token = drinkAsText.split(DELIMITER);
        Drinks drink;
        try {
            drink = new Drinks(token[0], Double.parseDouble(token[1]), Integer.parseInt(token[2]));
            //System.out.println(token[0] + " " +  Double.parseDouble(token[1]) + " " + Integer.parseInt(token[2]));
            //        anItem.setPrice(Double.parseDouble(token[1]));
            //        anItem.setQuantity(Integer.parseInt(token[2]));
        } catch (NumberFormatException ex) {
            throw new VMPersistenceException("Apologies, something has gone wrong.  ", ex);
        }
        return drink;
    }

    private void read() throws VMPersistenceException {

        Scanner scan;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(DRINKS_FILE)));
        } catch (FileNotFoundException ex) {
            throw new VMPersistenceException("Apologies, the file could not be loaded. ");
        }

        String currentLine;
        Drinks currentDrink;

        while (scan.hasNextLine()) {
            currentLine = scan.nextLine();
            currentDrink = unmarshalling(currentLine);

            drinks.put(currentDrink.getName(), currentDrink);
        }

        scan.close();

    }

    private void write() throws VMPersistenceException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(DRINKS_FILE));
        } catch (IOException ex) {
            throw new VMPersistenceException("Apologies, data can not be saved. ");
        }

        String itemAsText;

        List<Drinks> drinkList = new ArrayList<>(drinks.values());

        for (Drinks currentDrink : drinkList) {
            itemAsText = marshalling(currentDrink);
            out.println(itemAsText);
            out.flush();
        }

        out.close();
    }

    @Override
    public void update(String name, Drinks value) throws VMPersistenceException {
        read();
        drinks.replace(name, value);
        write();
    }

    @Override
    public Drinks addItem(Drinks drink) throws VMPersistenceException {
        read();
        Drinks added = drinks.put(drink.getName(), drink);
        write();
        return added;

    }

}
