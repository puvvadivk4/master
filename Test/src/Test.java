import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Test {

	public static void main(String[] args) {
		
		
		List<TotalEntity> list =new ArrayList<TotalEntity>(Arrays.asList(
				new TotalEntity(1, "A",new ArrayList<String>(Arrays.asList("A","Big","C"))),
				new TotalEntity(2, "Aaa",new ArrayList<String>(Arrays.asList("A","B","C"))),
				new TotalEntity(3, "Addd",new ArrayList<String>(Arrays.asList("A","Big","C")))
				));
		
		
		
		//old style of looping
		
		for(int i=0;i<list.size();i++)
		{
			

			for(int j=0;j<list.get(i).getlStrings().size();j++)
			{
				if(list.get(i).getlStrings().get(j)=="Big")
				{
					System.out.println(list.get(i).getName());
				}
				
			}
		}
		
		System.out.println("----------------");
		
		//j7 need only string as Big then print id name
		for(TotalEntity e : list)
		{
			for(String s : e.getlStrings())
			{
				if(s.equals("Big"))
				{
					System.out.println(e.getName());
				}
			}
		}
		
		
		
		
		
		
		//j8
		System.out.println("st");
		//list.stream().map(x->x.getlStrings()).filter(x->x.equals("Big")).forEach(x->System.out.println(x));
		
//		Optional<String> d=list.stream().map(x->x.getlStrings().stream()).flatMap(stream->stream.filter(x->x.equals("Big"))).findAny();
//		d.ifPresent(x->System.out.println(x));
//		
//		System.out.println("end");
		
		
		
		 	list.stream().map(x->
		 	
		 	{ 
		 		System.out.println(x.getId());
		 		return x.getlStrings().stream().filter(a->
		 														{
		 															if(true)
		 															System.out.println(x.getName());	
		 															return true;
		 			
		 														}
		 													);
		 	});
		 	
		 	
//		 	
//		 	list.stream().peek(x->x.getlStrings().stream().filter(a->a.equals("Big")).peek(y->System.out.println("vamsi   "+x.getId())).count());
//	 
//list.forEach(x->
//		 	
//		 	{ 		 		
//		 			
//		 		x.getlStrings().forEach(y->
//		 		{
//		 		if(y.equals("Big"))	
//		 			System.out.println(x.getName());
//		 		});
//		 													
//		 	});
//		 	
		
		System.out.println("J8");
		
		
		
	}

	

}
