import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JSONReadFromFile {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader(
                    "/Users/davidgomezdesegura/Desktop/file1.txt"));

            JSONObject jsonObject = (JSONObject) obj;

            String private_key = (String) jsonObject.get("Private key");
            String transaction = (String) jsonObject.get("Transaction");
            //JSONArray content = (JSONArray) jsonObject.get("Wallet");

            data wallet = new data();
            wallet.private_key = private_key;
            System.out.println("Private key: " + private_key);
            wallet.transactions = transaction;
            System.out.println("Transaction: " + transaction);
            /*System.out.println("\nWallet:");
            Iterator<String> iterator = content.iterator();


            while (iterator.hasNext()) {
                System.out.println(wallet.private_key);

            } */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}