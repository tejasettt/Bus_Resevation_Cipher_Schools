package org.example;

import java.util.ArrayList;
import java.util.List;

public class AdminOperations {
    List<BusDetails> busList = new ArrayList<>();
    public void createBus(String busNumber,String operatorName,String source,String destination){
        BusDetails busDetails = new BusDetails(busNumber,operatorName,source,destination);
        busList.add(busDetails);
        System.out.println(busList.size());
    }

    @Override
    public String toString() {
        return "AdminOperations{" +
                "busList=" + busList +
                '}';
    }
}
