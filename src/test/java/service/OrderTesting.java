package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;

public class OrderTesting {
    private Application application;
    private CalculatorService calculatorService;

    @Before
    public void init(){
        calculatorService = Mockito.mock(CalculatorService.class);
        application = new Application(calculatorService);
    }

    @Test
    public void orderTest(){
        Mockito.when(calculatorService.add(20, 32)).thenReturn(52);
        Mockito.when(calculatorService.subtract(30, 20)).thenReturn(10);

        Assert.assertEquals(52, application.add(20, 32));
        Assert.assertEquals(10, application.subtract(30, 20));

        InOrder inOrder = Mockito.inOrder(calculatorService);
        inOrder.verify(calculatorService).add(20, 32);
        inOrder.verify(calculatorService).subtract(30, 20);
    }

}
