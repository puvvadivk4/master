package com.sample.jaxb.jaxbsample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.up.jaxbprojct.domain.TrainListReply;
import com.up.jaxbprojct.domain.TrainListReply.TrainList;
import com.up.jaxbprojct.domain.TrainListReply.TrainList.Train;

@SpringBootApplication
public class JaxbsampleApplication {

	public static void main(String[] args) throws FileNotFoundException, JAXBException, DatatypeConfigurationException {
		// TODO Auto-generated method stub
		SpringApplication.run(JaxbsampleApplication.class, args);
		marshallingsample();
	}

	/*
	 * public int unmarshallingSample() {
	 * 
	 * int size=0; try {
	 * 
	 * File file = new File("train.xml"); JAXBContext jaxbContext =
	 * JAXBContext.newInstance(TrainListReply.class);
	 * 
	 * Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	 * TrainListReply lstrply= (TrainListReply) jaxbUnmarshaller.unmarshal(file);
	 * 
	 * 
	 * 
	 * TrainList lst= lstrply.getTrainList(); size=lst.getTrain().size(); for(Train
	 * train:lst.getTrain()) System.out.println(train.getId());
	 * 
	 * } catch (JAXBException e) { e.printStackTrace(); } return size; }
	 */

	public static void marshallingsample() throws JAXBException, FileNotFoundException, DatatypeConfigurationException {

		JAXBContext contextObj = JAXBContext.newInstance(TrainListReply.class);  

		Marshaller marshallerObj = contextObj.createMarshaller();  
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Train t = new Train();
		t.setId(4444);
		t.setSource("src");
		t.setDestination("des");
		//new GregorianCalendar().setTime((new Date())
		GregorianCalendar gregory = new GregorianCalendar();
		gregory.setTime(new Date());
		XMLGregorianCalendar calendar = DatatypeFactory.newInstance()
		        .newXMLGregorianCalendar(
		            gregory);
		t.setScheduleDate(calendar);
		List<Train> lst = new ArrayList<Train>();
		lst.add(t);

		TrainList tlst= new TrainList();
		tlst.setTrain(lst);
		TrainListReply lstrply=new TrainListReply();
		lstrply.setTrainList(tlst);

		marshallerObj.marshal(lstrply, new FileOutputStream("D:\\vamsi\\javaprjcts\\excercise\\jaxbsample\\test.xml"));  
	}



}


