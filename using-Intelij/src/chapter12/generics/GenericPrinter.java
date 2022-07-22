package chapter12.generics;

public class GenericPrinter<T extends Material> {
    //extends 명령어로 사용할 수 있는 자료형에 제한을 둠
    private T meterial;

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }

    public T getMeterial() {
        return meterial;
    }

    public String toString() {
        return meterial.toString();
    }

    public void printing() {
        meterial.doPrinting();
    }
}
