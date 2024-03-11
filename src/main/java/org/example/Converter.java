package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Converter {

    private static final String API_URL = "https://open.er-api.com/v6/latest/";

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        try {
            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Parse JSON response to get exchange rates
                double fromRate = getExchangeRate(response.toString(), fromCurrency);
                double toRate = getExchangeRate(response.toString(), toCurrency);

                if (fromRate != -1.0 && toRate != -1.0) {
                    return amount * (toRate / fromRate);
                } else {
                    System.out.println("Invalid currency code.");
                    return -1.0;
                }
            } else {
                System.out.println("Error retrieving exchange rates. HTTP error code: " + responseCode);
                return -1.0;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return -1.0;
        }
    }

    private static double getExchangeRate(String jsonResponse, String currencyCode) {
        // Parse the JSON response to get the exchange rate for the specified currency code
        int index = jsonResponse.indexOf("\"" + currencyCode + "\":");
        if (index != -1) {
            String substring = jsonResponse.substring(index + currencyCode.length() + 4);
            int endIndex = substring.indexOf(",");
            if (endIndex != -1) {
                String rateString = substring.substring(0, endIndex);
                return Double.parseDouble(rateString);
            }
        }
        return -1.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter the currency code to convert from: ");
            String fromCurrency = scanner.next().toUpperCase();

            System.out.print("Enter the currency code to convert to: ");
            String toCurrency = scanner.next().toUpperCase();

            double result = convertCurrency(amount, fromCurrency, toCurrency);

            if (result != -1.0) {
                System.out.printf("%.2f %s is equal to %.2f %s%n", amount, fromCurrency, result, toCurrency);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numeric amount and currency codes.");
        } finally {
            scanner.close();
        }
    }
}
