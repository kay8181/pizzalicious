package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {
    LocalTime time;
    LocalDate date;
    Order order;

    public ReceiptWriter(Order order) {
        this.time = LocalTime.now();
        this.date = LocalDate.now();
        this.order = order;
    }

    public void receipt() throws IOException {
        DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter fmtTime = DateTimeFormatter.ofPattern("HHmmss");

        String formattedDate = this.date.format(fmtDate);
        String formattedTime = this.time.format(fmtTime);

        String filename = "ReceiptFolder\\"+formattedDate+"-"+formattedTime+".txt";

        FileWriter fileWriter = new FileWriter(filename);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);

        String receiptHeader = "            PIZZALICIOUS";
        String receiptHeader2 = "\n⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯\n";
        String receiptHeader3 = "\n⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯\n";
        String receiptBody = order.stringTotalOrder();
        String receiptFooter = "\n\n         Have a PIZZA-licious Day";

        fmtDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        fmtTime = DateTimeFormatter.ofPattern("HH:mm");

        formattedDate = this.date.format(fmtDate);
        formattedTime = this.time.format(fmtTime);

        bufWriter.write(receiptHeader);
        bufWriter.write(receiptHeader2);
        bufWriter.write(receiptHeader3);
        bufWriter.write(receiptBody);
        bufWriter.write(formattedDate+" "+formattedTime);
        bufWriter.write(receiptFooter);
        bufWriter.close();
    }


}
