package service;

import java.util.List;

public class ProcessForMockService {
    private ServiceToMock serviceToMock;
    public ProcessForMockService(ServiceToMock serviceToMock){
        this.serviceToMock = serviceToMock;
    }

    public String processing(){
        int a = serviceToMock.doSomeThing();
        return "After doing something the number is " + a;
    }

    public String processingWithParameters(int a){
        int b = serviceToMock.doSomethingWithParameter(a);
        return "After doing something with parameter, the number is " + b;
    }

    public String processInt(int a){
        int number = serviceToMock.somethingOnInt(a);
        return "Output is " + number;
    }

    public String processBool(boolean a){
        return "Output is " + serviceToMock.somethingOnBool(a);
    }

    public String processFloat(float a){
        return "Output is " + serviceToMock.somethingOnFloat(a);
    }

    public String processList(List a){
        return "Output is " + serviceToMock.somethingOnList(a);
    }

    public String processString(String a){
        return "Output is " + serviceToMock.somethingOnString(a);
    }
}
