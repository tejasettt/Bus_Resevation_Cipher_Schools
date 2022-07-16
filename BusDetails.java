package org.example;

public class BusDetails {
    private String busNumber;
    private String operatorName;
    private String source;
    private String destination;

    public BusDetails(String busNumber, String operatorName, String source, String destination) {
        this.busNumber = busNumber;
        this.operatorName = operatorName;
        this.source = source;
        this.destination = destination;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
