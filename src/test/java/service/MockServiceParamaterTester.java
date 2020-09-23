package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MockServiceParamaterTester {



    ServiceToMock serviceToMock;
    ProcessForMockService processForMockService;

    @Before
    public void init(){
        serviceToMock = Mockito.mock(ServiceToMock.class);
        processForMockService = new ProcessForMockService(serviceToMock);
    }

    @Test
    public void testInt(){
        Mockito.when(serviceToMock.somethingOnInt(Matchers.anyInt())).thenReturn(10);
        String out = processForMockService.processInt(23);
        Assert.assertEquals("Output is 10", out);
    }

    @Test
    public void testFloat(){
        Mockito.when(serviceToMock.somethingOnFloat(Matchers.anyFloat())).thenReturn(23);
        String out = processForMockService.processFloat(23.0f);
        Assert.assertEquals("Output is 23", out);
    }

    @Test
    public void testString(){
        Mockito.when(serviceToMock.somethingOnString(Matchers.anyString())).thenReturn(10);
        String out = processForMockService.processString("ABC");
        Assert.assertEquals("Output is 10", out);
    }

    @Test
    public void testBool(){
        Mockito.when(serviceToMock.somethingOnBool(Matchers.anyBoolean())).thenReturn(10);
        String out = processForMockService.processBool(true);
        Assert.assertEquals("Output is 10", out);
    }
}
