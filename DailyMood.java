package com.mycompany.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DailyMood {

    private static final String FILE_PATH = "moodtrack.json";

    private int value1;
    private int value2;
    private int value3;
    private int value4;

    public DailyMood() {
        loadFromJson();
    }

    /** Load JSON file secara manual */
    private void loadFromJson() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) sb.append(line);

            String json = sb.toString().trim();

            // Hilangkan karakter { } dan spasi
            json = json.replace("{", "").replace("}", "").trim();

            String[] entries = json.split(",");

            for (String entry : entries) {
                String[] pair = entry.split(":");
                String key = pair[0].replace("\"", "").trim();
                int value = Integer.parseInt(pair[1].trim());

                switch (key) {
                    case "1": value1 = value; break;
                    case "2": value2 = value; break;
                    case "3": value3 = value; break;
                    case "4": value4 = value; break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to load moodtrack.json");
        }
    }

    /** Simpan kembali ke JSON */
    private void saveToJson() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {

            String json = "{\n" +
                    "    \"1\": " + value1 + ",\n" +
                    "    \"2\": " + value2 + ",\n" +
                    "    \"3\": " + value3 + ",\n" +
                    "    \"4\": " + value4 + "\n" +
                    "}";

            bw.write(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Tambah nilai mood ke salah satu kategori */
    public void addMood(int category, int amount) {
        switch (category) {
            case 1: value1 += amount; break;
            case 2: value2 += amount; break;
            case 3: value3 += amount; break;
            case 4: value4 += amount; break;
        }
        saveToJson();
    }

    // Getter
    public int getValue1() { return value1; }
    public int getValue2() { return value2; }
    public int getValue3() { return value3; }
    public int getValue4() { return value4; }

    // Optional: untuk debug
    @Override
    public String toString() {
        return "DailyMood{" +
                "1=" + value1 +
                ", 2=" + value2 +
                ", 3=" + value3 +
                ", 4=" + value4 +
                '}';
    }
}
