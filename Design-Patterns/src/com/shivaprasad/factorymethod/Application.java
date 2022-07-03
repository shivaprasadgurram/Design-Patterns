package com.shivaprasad.factorymethod;

public class Application {

    public static void main(String[] args) {

        BatchProcessor batchProcessor = createBatchProcessor(args[1]);
        batchProcessor.processBatchFile(args[0]);
        System.out.println("Done.");
    }

    /* This is not Factory Method, This resides at client side to determine which Parser they
    want */
    private static BatchProcessor createBatchProcessor(String format) {
        if(format.equals("text")) return new TextBatchProcessor();
        if(format.equals("csv")) return new CSVBatchProcessor();
        if(format.equals("xml")) return new XMLBatchProcessor();
        if(format.equals("xlsx")) return new XLSXBatchProcessor();
        return null;
    }
}
