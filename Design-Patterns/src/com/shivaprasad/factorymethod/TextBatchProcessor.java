package com.shivaprasad.factorymethod;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor{

    @Override
    public Parser createParser(File file) {
        return new TextParser(file);
    }
}
