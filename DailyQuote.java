package com.mycompany.main;

import java.nio.file.*;
import java.time.LocalDate;
import java.util.Random;

public class DailyQuote {
    public static String getTodaysQuote() throws Exception {
        String stateFile = "quote_state.txt";
        String jsonFile = "quotes.json";
        LocalDate today = LocalDate.now();

        // 1. Check if state file exists
        if (Files.exists(Paths.get(stateFile))) {
            String state = Files.readString(Paths.get(stateFile));
            String[] parts = state.split("\\|");

            LocalDate savedDate = LocalDate.parse(parts[0]);
            int savedIndex = Integer.parseInt(parts[1]);

            // If date is same → use stored quote
            if (savedDate.equals(today)) {
                return getQuoteFromJson(jsonFile, savedIndex);
            }
        }

        // 2. Date changed → pick a new random quote
        int quoteIndex = new Random().nextInt(10) + 1; // 1–10

        // Save today + chosen quote
        Files.writeString(
                Paths.get(stateFile),
                today.toString() + "|" + quoteIndex
        );

        return getQuoteFromJson(jsonFile, quoteIndex);
    }

    // Extract quote manually (no JSON library)
    private static String getQuoteFromJson(String jsonFile, int index) throws Exception {
        String json = Files.readString(Paths.get(jsonFile));

        // Cari bagian dalam "quotes": {...}
        int quotesStart = json.indexOf("\"quotes\"");
        if (quotesStart == -1) return "Quotes object not found";

        int braceStart = json.indexOf("{", quotesStart);
        int braceEnd = json.indexOf("}", braceStart);
        if (braceStart == -1 || braceEnd == -1) return "Invalid quotes JSON";

        // Ambil hanya isi quotes
        String quotesContent = json.substring(braceStart, braceEnd + 1);

        // Cari key "index"
        String key = "\"" + index + "\":";
        int start = quotesContent.indexOf(key);
        if (start == -1) return "Quote not found";

        // ambil teks setelah key
        start = quotesContent.indexOf("\"", start + key.length()) + 1;
        int end = quotesContent.indexOf("\"", start);

        return quotesContent.substring(start, end);
    }
}