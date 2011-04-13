package com.don.quant;

import static java.lang.System.out;

import org.apache.log4j.BasicConfigurator;
import org.junit.Assert;
import org.junit.Test;


public class ReturnTest 
{
	@Test
    public void testApp()
    {
    	BasicConfigurator.configure();
		Return aReturn = new Return();
		final double [] daVami = {1000, 1050, 1100, 1150, 1150, 1200, 1250, 1300, 1350, 1400, 1450, 1500, 
								1550, 1600, 1650, 1700, 1750, 1800, 1850, 1900, 1950, 2000, 2050, 2100, 
								2150, 2200, 2250, 2300, 2350, 2400, 2450, 2500, 2550, 2600, 2650, 2700, 
								2750, 2800, 2850, 2900, 2950, 3000, 3050, 3100, 3150, 3200, 3250, 3300, 
								3350, 3450, 3500, 3550, 3600, 3650, 3700, 3750, 3800, 3850, 3900, 3950, 4000								
								};
		out.println(  aReturn.getSimpleReturn(daVami ));
		out.println(  aReturn.getCompoundReturn(daVami));
		
		
		double compoundReturn=aReturn.getCompoundReturn(daVami);
		double simpleReturn = aReturn.getSimpleReturn(daVami);
		
		Assert.assertTrue( simpleReturn == 0.6 );
		Assert.assertTrue( compoundReturn == 0.3195079107728942);
    }
}
