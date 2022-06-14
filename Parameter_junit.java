import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Collector;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Calculator
{
	public int add(int x, int y)
	{
		return x+y;
	}
	public int sub(int x, int y)
	{
		return x+y;
	}
}

public class Parameter_junit {

	private int expresult;
	private int firstval;
	private int secval;
	Calculator cal=new Calculator();
	public void AddParamTest(int expresult, int firstval, int secval)
	{
		this.expresult=expresult;
		this.firstval=firstval;
		this.secval=secval;
		
	}
@Parameters
public static Collector<Object []>testdata()
{
	Object[][] data=new Object[][] {{9,4,5},{4,3,1},{6,1,5}}
	return Arrays.asList(data);
	}
}
@Test
public void testAdd()
{
	assertEquals(expresult,cal.add(firstval, secval));
	
}
}
