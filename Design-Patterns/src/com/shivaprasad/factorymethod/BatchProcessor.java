package com.shivaprasad.factorymethod;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor {

    public final void processBatchFile(String fileName) {
        File file = openFile(fileName);
        Parser parser = createParser(file); //Factory Method
        List<Record> records = parser.parse();
        processRecords(records);
        writeSummary();
        closeFile(file);
    }

    /* FACTORY METHOD -> It only knows that it needs to create a parser but don't know about what exact
    type of parser it needs to create. */
    public abstract Parser createParser(File file);

    private File openFile(String fileName) {
        System.out.println("Opened file");
        return null;
    }

    private void processRecords(List<Record> records) {
        System.out.println("Processing each record... db calls happened, etc.");
    }

    private void writeSummary() {
        System.out.println("Wrote batch summary - 0 failed.");
    }

    private void closeFile(File file) {
        System.out.println("Closed file.");
    }
}
