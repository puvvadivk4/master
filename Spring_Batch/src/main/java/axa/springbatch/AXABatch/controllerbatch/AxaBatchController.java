package axa.springbatch.AXABatch.controllerbatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import axa.springbatch.AXABatch.mailconfig.MmailConfig;


@RestController
public class AxaBatchController {

	@Autowired
    JobLauncher jobLauncher;
 
    @Autowired
    Job processJob;
    @Autowired
    Job processJob2;
    
    
    JobParameters jobParametres;
    @GetMapping("/axabatch")
	public String getMessageUisngbatch() throws Exception
	{
    	jobParametres=new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
		jobLauncher.run(processJob, jobParametres);
	//	System.out.println(new MmailConfig().send());
		//jobLauncher.run(processJob, jobParametres);		
		return "batch Job has invoked";
		
	}
    
    /*@Scheduled(fixedRate=5000)
    private void schdule() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException
    {
    	jobLauncher.run(processJob2, jobParametres);
    }*/
    
}
