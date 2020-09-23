package service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTesterAnnotation {
    @Mock
    CalculatorService calculatorService;

    @InjectMocks
    Application application = new Application(calculatorService);

    @Test
    public void testingAdd(){
        when(calculatorService.add(10, 20)).thenReturn(30);
        int expected = 30;
        Assert.assertEquals(expected, application.add(10, 20));
    }

    @Test
    public void testingSubtract(){
        when(calculatorService.subtract(10, 20)).thenReturn(-10);
        int expected = -10;
        Assert.assertEquals(expected, application.subtract(10, 20));
    }
}
