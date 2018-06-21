package axa.springbatch.AXABatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import axa.springbatch.AXABatch.axastep.AxaItemProcessor;
import axa.springbatch.AXABatch.axastep.AxaItemReader;
import axa.springbatch.AXABatch.axastep.AxaItemWriter;
import axa.springbatch.AXABatch.axastep.AxaItemProcessExcel;
import axa.springbatch.AXABatch.axastep.AxaItemReaderExcel;
import axa.springbatch.AXABatch.axastep.AxaItemWriterExcel;
import axa.springbatch.AXABatch.listner.AxaJobCompletionListner;




@Configuration
public class AxaBatchConfig {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	
	
	
	@Bean
	public Job processJob() {
		System.out.println("process job start");
		Job jj=null;
		jj= jobBuilderFactory.get("processJob")
				.incrementer(new RunIdIncrementer()).start(orderStep2())
				.listener(listener()).build();
		/*jj= jobBuilderFactory.get("processJob")
				.incrementer(new RunIdIncrementer())
				.listener(listener()).flow(orderStep2()).end().build();*/
		System.out.println("process job ends");		
		return jj;
	}
	
	/*@Bean
	public Job processJob2() {
		System.out.println("process job2 start");
		Job jj=null;
		jj= jobBuilderFactory.get("processJob2")
				.incrementer(new RunIdIncrementer()).start(orderStep1())
				.listener(listener()).build();		
		System.out.println("process job2 ends");		
		return jj;
	}*/
	
	@Bean
	public Step orderStep1() {
		System.out.println("step1 starts");
		return stepBuilderFactory.get("orderStep1").<String, String> chunk(1)
				.reader(new AxaItemReader()).processor(new AxaItemProcessor())
				.writer(new AxaItemWriter()).build();
	}
	
	@Bean
	public Step orderStep2() {
		System.out.println("step2 starts");
		Step s=null;
		s= stepBuilderFactory.get("orderStep2").<String, String> chunk(1)
				.reader(new AxaItemReaderExcel()).processor(new AxaItemProcessExcel())
				.writer(new AxaItemWriterExcel()).build();
		System.out.println("step2 ends");
		return s;
	}

	@Bean
	public JobExecutionListener listener() {
		return new AxaJobCompletionListner();
	}
	
	
	
	
}
