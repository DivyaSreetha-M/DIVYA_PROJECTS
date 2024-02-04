package ams;
import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		String admin_name="abcd";
		String admin_pwd="1234";
		boolean loop=true;
		while(loop)
		{
			System.out.println("**************************************************");
			System.out.println("       WELCOME TO AIRLINE MANAGEMENT SYSTEM       ");
			System.out.println("**************************************************");
			System.out.println("1.Admin");
			System.out.println("2.User");
			System.out.println("3.Exit");
			int ch=sc.nextInt();
		
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter Admin name:");
					String name=sc.next();
					System.out.println("Enter your password:");
					String pwd=sc.next();
					if(name.equals(admin_name) && pwd.equals(admin_pwd))
					{
						Flight[] flightdetails=new Flight[0];
						boolean loop_1=true;
						while(loop_1)
						{
							System.out.println("--------------------------------------------");
							System.out.println("               WELCOME ADMIN                ");
							System.out.println("--------------------------------------------");
							System.out.println("1.Add Flight Details");
							System.out.println("2.View Flight Details");
							System.out.println("3.Remove Flight Details");
							System.out.println("4.Edit Flight Details");
							System.out.println("5.Exit");
							int choice=sc.nextInt();
				
							switch(choice)
							{
								case 1:
								{
									
									System.out.println("Enter Carrier Id:");
									int carrier_id=sc.nextInt();
									System.out.println("Enter Origin:");
									String origin=sc.next();
									System.out.println("Enter Destination:");
									String destination=sc.next();
									System.out.println("Enter Airfare:");
									int airfare=sc.nextInt();
									System.out.println("Enter Seat Capacity of Business Class:");
									int business_seat=sc.nextInt();
									System.out.println("Enter Seat Capacity of Economy Class:");
									int economy_seat=sc.nextInt();
									System.out.println("Enter Seat Capacity of Executive Class:");
									int executive_seat=sc.nextInt();
									Flight f=new Flight(carrier_id,origin,destination,airfare,business_seat,economy_seat,executive_seat);
									
									flightdetails=Arrays.copyOf(flightdetails,flightdetails.length+1);
									flightdetails[flightdetails.length-1]=f;
								
									System.out.println("Flight Information saved successfully in the system");
									break;
								}
								case 2:
								{
									System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
									System.out.println("                                          FLIGHT DETAILS                                     ");
									System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
									System.out.println("FLIGHTID     CARRIERID     ORIGIN     DESTINATION     AIRFARE     BUSINESS CLASS SEAT     ECONOMY CLASS SEAT     EXECUTIVE CLASS SEAT");
									for(Flight obj:flightdetails)
									{
							
										System.out.println("   "+obj.flightid+"            "+obj.carrierid+"        "+obj.origin+"       "+obj.destination+"         "+obj.airfare+"            "+obj.businessseat+"                "+obj.economyseat+"                "+obj.executiveseat);
									
									}
									break;
								}
								case 3:
								{
									break;
								}
								case 4:
								{
									break;
								}
								case 5:
								{
									loop_1=false;
									System.out.println("Thank you");
									break;
								}
							}
						}
					}
					else
					{
						System.out.println("Please enter appropriate admin name and password");
					}
					break;
				}
		
				case 2:
				{
					boolean loop_2=true;
					while(loop_2)
					{
						System.out.println("1.Search Flight Details");
						System.out.println("2.Book Flight Details");
						System.out.println("3.view Flight Details");
						System.out.println("4.Cancel Flight Details");
						System.out.println("5.Exit");
						int n=sc.nextInt();
						switch(n)
						{
							case 1:
							{
								System.out.println("**************************************************");
				
								break;
							}
							case 2:
							{
								break;
							}
							case 3:
							{
								break;
							}
							case 4:
							{
								break;
							}
							case 5:
							{
								loop_2=false;
								System.out.println("Thank you");
								break;
							}
						}
			
					}
					break;
				}
		
				case 3:
				{
					loop=false;
					System.out.println("Thank you Visit Again");

				}
			}
		}
	}

}
