package axa.springbatch.AXABatch.axastep;

import org.springframework.batch.item.ItemProcessor;

public class AxaItemProcessExcel implements ItemProcessor<String, String> {

	@Override
	public String process(String data) throws Exception {
		
		return data.toUpperCase();
	}

}
