package com.don.quant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Return {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(Return.class);
	
	public double getSimpleReturn( double[] daVami /*double array == da */ ) {
		double Pend = daVami[daVami.length-1];
		double Pstart = daVami[0];
		double yearsHeld = daVami.length / 12;
		
		double simpleReturn = ( (Pend / Pstart) - 1) / yearsHeld;
		
		if( LOGGER.isDebugEnabled() ) {
			String sFormat = String.format( "(%.3f / %.3f -1 / %f = %10f", Pend, Pstart, yearsHeld, simpleReturn );		
			LOGGER.debug(sFormat);
		}
		
		return simpleReturn;
	}
	
	public double getCompoundReturn( double[] daVami ) {
		double Pend = daVami[daVami.length-1];
		double Pstart = daVami[0];
		double yearsHeld = daVami.length / 12;
		
		double compoundReturn = Math.pow( ( Pend / Pstart ), 1d/yearsHeld) - 1 ;
		
		if( LOGGER.isDebugEnabled() ) {
			String sFormat = String.format( "Math.pow( (%.3f / %.3f), 1 / %.3f ) - 1", Pend, Pstart, yearsHeld);		
			LOGGER.debug(sFormat);
		}
		
		return compoundReturn;
		
	}
	
}
