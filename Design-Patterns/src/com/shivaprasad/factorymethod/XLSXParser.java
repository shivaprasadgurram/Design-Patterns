package com.shivaprasad.factorymethod;

import java.io.File;
import java.util.List;

public class XLSXParser implements Parser{

    public XLSXParser(File file) {
        System.out.println("Creating XLSX parser");
    }
    @Override
    public List<Record> parse() {
        System.out.println("Processing XLSX and creating records.");
        return null;
    }
}
