package hw4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Currency> currencyList = new ArrayList<>();
        String request = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

        String result = performRequest(request);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Currency[] currencies = gson.fromJson(result, Currency[].class);

        for (Currency currency : currencies) {
            if (currency.getCc().equals("RUB") | currency.getCc().equals("USD") | currency.getCc().equals("EUR")) {
                currencyList.add(currency);
            }
            //System.out.println(currency);
        }
        System.out.println(currencyList);
        System.out.println("Json: \t" + gson.toJson(currencyList));
    }

    private static String performRequest(String request) {
        URL url;
        HttpURLConnection httpURLConnection = null;
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        try {
            url = new URL(request);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            char[] buf = new char[1000000];

            int counter;
            do {
                if ((counter = br.read(buf)) > 0) {
                    sb.append(new String(buf, 0, counter));
                }
            } while (counter > 0);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            httpURLConnection.disconnect();
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
