package org.marshalling;

import java.util.Iterator;
import java.util.PriorityQueue;

public class StartClass {

	/*public static void main(String[] args) {

		Player p1=new Player(111, "A", 75);
		Player p2=new Player(112, "B", 25);
		Player p3=new Player(222, "C", 100);
		Player p4=new Player(223, "D", 20);
		List<Player> players= new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		List<Player> players2= new ArrayList<Player>();
		players2.add(p3);
		players2.add(p4);

		Team t1= new Team(100,"T1", players.stream().mapToInt(x->x.getPscore()).sum(), players);
		Team t2= new Team(101,"T2", players2.stream().mapToInt(x->x.getPscore()).sum(), players2);

		List<Team> teams= new ArrayList<Team>();
		teams.add(t1);
		teams.add(t2);
		Teams teamss = new Teams(teams);

		//Marshaling...............................
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Teams.class);
			Marshaller m = jaxbContext.createMarshaller();
			m.marshal(teamss, new File("D:\\sampply.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Un Marshaling...............................
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Teams.class);
			Unmarshaller um = jaxbContext.createUnmarshaller();
			Teams ts=(Teams)um.unmarshal(new File("D:\\sampply.xml"));
			System.out.println("unmarshaling........................");
			System.out.println(ts.getTeams().get(0).getScore());
		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

*/
	public static void main(String args[]){  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Amit Sharma");  
	queue.add("Vijay Raj");  
	queue.add("JaiShankar");  
	queue.add("Raj");

	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator itr=queue.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	queue.remove();  
	queue.poll();  
	System.out.println("after removing two elements:");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  
	}  	

}
