package axa.springbatch.AXABatch.axastep;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;




public class AxaItemReader implements ItemReader {
	
	private String[] messages = { "itemreader1",
			"itemreader2",
			"itemreader3" };

	private int count = 0;

	
	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		
		if(count<messages.length)
		{
			
		   return messages[count++];
		} else {
			count = 0;
		}
		
		return null;
	}

	
}
