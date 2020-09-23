package service;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockServiceTester {

    @Test
    public void testProcessMethod(){
        ServiceToMock serviceToMock = Mockito.mock(ServiceToMock.class);
        Mockito.when(serviceToMock.doSomeThing()).thenReturn(10, 20, 30);
        ProcessForMockService processForMockService = new ProcessForMockService(serviceToMock);

        String message = processForMockService.processing();
        String expected = "After doing something the number is 10";
        System.out.println("This is message 1 : " + message);
        Assert.assertEquals(expected, message);

        String message2 = processForMockService.processing();
        System.out.println("This is message 2 : " + message2);
        Assert.assertEquals("After doing something the number is 20", message2);

        String message3 = processForMockService.processing();
        System.out.println("This is message 3 : " + message3);
        Assert.assertEquals("After doing something the number is 30", message3);
    }

}
