package service;

import java.util.List;

public interface ServiceToMock {
    int doSomeThing();
    int doSomethingWithParameter(int a);
    int somethingOnInt(int a);
    int somethingOnBool(boolean a);
    int somethingOnString(String a);
    int somethingOnList(List a);
    int somethingOnFloat(float a);
}
