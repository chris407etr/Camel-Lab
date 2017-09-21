package com.etr407.debugbean;

import org.apache.camel.Exchange;

public class DebugBean {
	//Debug remote java application on port 5005 (service mix in debug mode)
	public static void debug(Exchange exchange)
	{
		String id = exchange.getExchangeId();
	}
}
