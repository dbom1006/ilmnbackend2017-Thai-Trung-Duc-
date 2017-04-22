import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static List<AvailabilityBean> listAvail=new ArrayList<>();
	
	public static void findAvailability(String line){
		AvailabilityDAO av=new AvailabilityDAO();
		
		listAvail=new ArrayList<>();
		
		//Split string to get data day and time from console
		String[] arrDay=line.split(";");
		for (String s : arrDay) {
			s=s.trim();
			s=s.replace(";","");
			String day=s.substring(0,3);
			s=s.replace(day+"(","");
			s=s.replace(")", "");
			String[] arrTime=s.split(",");
			for (String time : arrTime) {
				String[] t=time.split(":");
				//get List Availability is available
				if(t[1].equals("A"))	
					listAvail.addAll(av.getList(day, t[0]));
			}
		}
		//Sort list Availability
		listAvail.sort(new Comparator<AvailabilityBean>() {
			@Override
			public int compare(AvailabilityBean o1, AvailabilityBean o2) {
				Map<String, Integer> map = new HashMap<>();
				map.put("MON",1);
				map.put("TUE",2);
				map.put("WED",3);
				map.put("THU",4);
				map.put("FRI",5);
				map.put("SAT",6);
				map.put("SUN",7);
				return map.get(o1.getDay())-map.get(o2.getDay());
			}
		});
		int i=1;
		for (AvailabilityBean avBean : listAvail) {
			System.out.println((i++)+". "+avBean.getFirstName()+" "+avBean.getLastName()+" "+avBean.getDay()+" "+avBean.getTime());
		}
	}
	private static void registerContact(String line,int idUser) {
		int pos=Integer.parseInt(line);
		ContactDAO ct=new ContactDAO();
		//Add to Database Availability
		ct.insertContact(listAvail.get(pos-1), idUser);
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String line;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Are you a buyer or a seller? (please answer B for buyer, and S for seller)");
		line=br.readLine();
		if(line.equals("B")){
			System.out.println("Please enter your availability, using this partten MON(7-9:A,9-10:U); TUE(9-10:U,10-10.5:A);");
			line=br.readLine();
			findAvailability(line);
			System.out.println("Please choose your seller.");
			line=br.readLine();
			registerContact(line,11);
			System.out.println("Thank you.");
		}

	}

	

}
