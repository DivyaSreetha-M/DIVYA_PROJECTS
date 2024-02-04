package ams;

public class Flight 
{
	static int id=1;
	int flightid;
	int carrierid;
	String origin;
	String destination;
	int airfare;
	int businessseat;
	int economyseat;
	int executiveseat;
	
	public Flight(int carrierid,String origin,String destination,int airfare,int businessseat,int economyseat,int executiveseat)
	{
		this.flightid=id++;
		this.carrierid=carrierid;
		this.origin=origin;
		this.destination=destination;
		this.airfare=airfare;
		this.businessseat=businessseat;
		this.economyseat=economyseat;
		this.executiveseat=executiveseat;
	}
} 
