package com.shivaprasad.factorymethod;

import java.io.File;

public class XLSXBatchProcessor extends BatchProcessor{

    @Override
    public Parser createParser(File file) {
        return new XLSXParser(file);
    }
}
