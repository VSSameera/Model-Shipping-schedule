import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.*;  
public class Main
{
    public static void TransitCalc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("list of Destination Provinces");
	    System.out.println("1. Ontario \n2. Quebec(Montreal/OtherCity) \n3. New Brunswick \n4. Nova Scotia\n5. Manitoba\n6. Saskatchewan\n7. Alberta\n8. British Columbia");
		System.out.println("Enter the Province");
		String Province = sc.nextLine();
		System.out.println("Enter a delivery date (dd/mm/yyyy): ");
		String dateStr = sc.next();
		int i = Integer.valueOf(Province);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDate date  = LocalDate.parse(dateStr, formatter);
        //String dayofweek = LocalDate.getDayOfWeek().toString();
         DayOfWeek deliveryday = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
		   switch(i)
		   {
		       case 1: 
			   if(deliveryday == DayOfWeek.SUNDAY)
				   {
					System.out.println("Shipment will not provided on Weekend");
					LocalDate alternateShipmentdate = date.minusDays(2);
					System.out.println("suggested shipping date : "+ alternateShipmentdate);
				}
					else
					{
						System.out.println("Transit days: 1");
						LocalDate result = date.minusDays(1);
						System.out.println("shipping date : "+ result);

					}
				
		           break;
		       case 2:
		           System.out.println("Enter the city name");
		           String city = sc.next();
		           if(city.equals("Montreal"))
		           {
		                System.out.println("Transit days: 1");
		                LocalDate result1 = date.plusDays(1);
		                System.out.println("Transit Date: "+ result1);
		           }
		           else
		           {
		                System.out.println("Transit days: 2");
		                LocalDate result2 = date.plusDays(2);
		                System.out.println("Transit Date: "+ result2);
		           }
		          break;
		       case 3:
		          System.out.println("Transit days: 2");
		          LocalDate result3 = date.plusDays(2);
		          System.out.println("Transit Date: "+ result3);
		          break;
		       case 4:
		          System.out.println("Transit days: 3");
		          LocalDate result4 = date.plusDays(3);
		          System.out.println("Transit Date: "+ result4);
		          break;
		      case 5:
		          System.out.println("Transit days: 6");
		          LocalDate result5 = date.plusDays(6);
		          System.out.println("Transit Date: "+ result5);
		          break;
		      case 6:
		          System.out.println("Transit days: 7");
		          LocalDate result6 = date.plusDays(7);
		          System.out.println("Transit Date: "+ result6);
		          break;
		      case 7:
		          System.out.println("Transit days: 8");
		          LocalDate result7 = date.plusDays(8);
		          System.out.println("Transit Date: "+ result7);
		          break;
		      case 8:
		          System.out.println("Transit days: 8");
		          LocalDate result8 = date.plusDays(8);
		          System.out.println("Transit Date: "+ result8);
		          break;
		      default: System.out.println("Invalid Province");
		   }
    
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    TransitCalc();
	    
		
	}
}