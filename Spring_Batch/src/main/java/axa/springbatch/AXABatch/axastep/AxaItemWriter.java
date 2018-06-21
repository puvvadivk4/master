package axa.springbatch.AXABatch.axastep;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class AxaItemWriter implements ItemWriter<String>{

	@Override
	public void write(List<? extends String> messages) throws Exception {
		
		for (String msg : messages) {
			System.out.println("Writing the data using item writer" + msg);
		}
	}

}
