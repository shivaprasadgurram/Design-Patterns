package com.shivaprasad.factorymethod;

import java.io.File;

public class CSVBatchProcessor extends BatchProcessor {

    @Override
    public Parser createParser(File file) {
        return new CSVParser(file);
    }
}
