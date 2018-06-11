package unmsm.ads;

import org.springframework.context.support.GenericXmlApplicationContext;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class MainTest extends TestCase{

    public MainTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( MainTest.class );
    }


    public void testMain()
    {
        assertTrue( true );
    }
    
    public void setUp() throws Exception
    {
    	GenericXmlApplicationContext context = new GenericXmlApplicationContext();
    	context.setValidating(false);
    	context.load("classpath:/beans.xml");
    	context.refresh();    	
    	assertNotNull(context);
    	assertEquals(context.containsBean("interestCalculator"), true);
    	InterestCalculator calculadorInteres = (InterestCalculator) context.getBean("interestCalculator");
    	assertNotNull(calculadorInteres);
    	assertNotNull(calculadorInteres.calculate(100, 1, Constantes.BCP));
    }
}
