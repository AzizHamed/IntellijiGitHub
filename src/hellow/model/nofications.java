package hellow.model;

import java.util.Objects;

public class nofications {
    public static void main(String[] args) {
        printMessage("hellow");
        printMessage("Iam fine");
    }

    private static void printMessage(String message) {
        System.out.println(message);
        System.out.println(message);
    }

    private String mesaage;
    private int timestamp;

    public nofications(String mesaage, int timestamp) {
        this.mesaage = mesaage;
        this.timestamp = timestamp;
    }

    public String getMesaage() {
        return mesaage;
    }

    public void setMesaage(String mesaage) {
        this.mesaage = mesaage;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "nofications{" +
                "mesaage='" + mesaage + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        nofications that = (nofications) o;
        return timestamp == that.timestamp && Objects.equals(mesaage, that.mesaage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mesaage, timestamp);
    }

}
