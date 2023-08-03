package org.example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba Oluşturmuş olduğum api ye get isteği atıp sonuçlarını ekranda göstericez");

        try {
            URL url = new URL("http://localhost:8080/demo/all");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type","application/json");
            int status = connection.getResponseCode();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            String inputLine;
            ArrayList<String> arrayList = new ArrayList<>(); // Burada ArrayList'in tipi String olarak belirlenmiş.

            while ((inputLine = in.readLine()) != null) {
                arrayList.add(inputLine);
            }
            System.out.println(arrayList);
            in.close();
            connection.disconnect();

            File file = new File("C:\\Users\\Ali\\Desktop\\MyApi\\src\\main\\resources\\Result.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line : arrayList) {
                bufferedWriter.newLine();
                bufferedWriter.write("\n"+line);

            }

            bufferedWriter.close();



        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}