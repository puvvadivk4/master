package axa.springbatch.AXABatch.axastep;

import org.springframework.batch.item.ItemProcessor;

public class AxaItemProcessor implements ItemProcessor<String,String>{

	
	
	public String process(String processdata) throws Exception {
		
		return processdata.toUpperCase();
	}

	
	
}
