package axa.springbatch.AXABatch.mailconfig;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;




public class MmailConfig {
	String host ="smtp.office365.com";//"smtp-mail.outlook.com";// "smtp.gmail.com";
	Properties props=System.getProperties();
	String from="krishvamsi4444@outlook.com";
	String to="krishvamsi4444@gmail.com";
	
	
	public String send() throws AddressException, MessagingException
	{
		 props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.user", from);
	       // props.put("mail.smtp.password", "vamsikrish4");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
		 Session session = Session.getDefaultInstance(props);
	        MimeMessage message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(from));
	      //  message.setRecipients(Message.RecipientType.TO, to);
	        message.addRecipients(Message.RecipientType.TO, to);
	        message.setSubject("Subject text");
            message.setText("nody text");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, "krishvamsi4@");
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            return "sucess";
	}
}
