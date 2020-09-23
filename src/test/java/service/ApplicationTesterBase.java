package service;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApplicationTesterBase {

    CalculatorService calculatorService = mock(CalculatorService.class);
    Application application = new Application(calculatorService);

    @Test
    public void testAddition(){
        when(calculatorService.add(10, 20)).thenReturn(30);
        int expected = 30;
        Assert.assertEquals(expected, application.add(10, 20));
    }
}
