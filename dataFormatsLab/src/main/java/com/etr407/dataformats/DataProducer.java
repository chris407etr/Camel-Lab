package com.etr407.dataformats;

public class DataProducer implements IDataMessageProducer {
	public TestModel getDataMessage()
	{
		TestModel test = new TestModel();
		test.setId("Test Id");
		return test;
	}
}
