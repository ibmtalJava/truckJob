package truckJob;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Driver> drivers= new ArrayList<>();
		drivers.add(new Driver("İsmail","Oğuz","05374789854"));
		drivers.add(new Driver("Burak", "Kural", "0532 548 78 65"));
		drivers.add(new Driver("Nur","Saad", "0534 548 65 65"));
		
		ArrayList<Truck> trucks= new ArrayList<>();
		trucks.add(new Truck("14 BM 526", "Scania", "2011"));
		trucks.get(0).setDriver(drivers.get(2));

		trucks.add(new Truck("34 GS 22", "Dodge", "1960",drivers.get(1)));

		trucks.add(new Truck());
		trucks.get(2).setPlateNumber("35 FB 60");
		trucks.get(2).setBrand("Mercedes");
		trucks.get(2).setModel("2023");
		trucks.get(2).setDriver(drivers.get(0));
		
		ArrayList<Company> companys = new ArrayList<>();
		companys.add(new Company("Uğur Sanayi","05986870445","Türkiye/İzmir"));
		companys.add(new Company("Burak Altyapı","05847511225","Türkiye/Eskişehir"));
		companys.add(new Company("Talha A.Ş","09638475695","Türkiye/Ankara"));
		
		ArrayList<Dispacher> dispachers = new ArrayList<>();
		dispachers.add(new Dispacher("Berat","Temirbaş","05478969689","temırbas@gmail.com"));
		dispachers.add(new Dispacher("Erdem","Bağcı","05741233446","bagci@gmail.com"));
		dispachers.add(new Dispacher("Batuhan","Bulut","05899411565","bulut@gmail.com"));

		ArrayList<Job> jobs=new ArrayList<>();
		jobs.add(new Job("Ostim Organize Sanayi/Ankara", "İkitelli Organize Sanayi/İstanbul", 12845.35, 24348.93, 423, companys.get(1), trucks.get(2), dispachers.get(0)));
		jobs.add(new Job("İzmir","Samsun", 34578.03, 28123.47, 2147, companys.get(2), trucks.get(0), dispachers.get(1)));
		jobs.add(new Job("Bolu","Çanakkale", 25953, 36800, 587, companys.get(0)
				, trucks.get(1), dispachers.get(2)));
	
		for(Job job:jobs) {
		 System.out.println("<----- "+ job.getJobFrom()+" - "+job.getJobDestination()+" ---->");
		 System.out.println("---İş Bilgileri---");
		 System.out.println("Nereden: "+job.getJobFrom());
		 System.out.println("Nereye : "+job.getJobDestination());
		 System.out.println("Tutar :"+job.getCost()+" TL");
		 System.out.println("Ağırlık : "+job.getWeight()+" KG");
		 System.out.println("Mesafe :"+job.getDestinationRange()+" KM");
		 System.out.println("---Müşteri Bilgileri---");
		 System.out.println("Şirket Adı :"+job.getCompany().getName());
		 System.out.println("Şirket Telefon:"+job.getCompany().getPhone());
		 System.out.println("Şirket Adresi:"+job.getCompany().getAddress());
		 System.out.println("---Araç Bilgileri---");
		 System.out.println("Plaka : "+job.getTruck().getPlateNumber());
		 System.out.println("Marka : "+job.getTruck().getBrand());
		 System.out.println("Model : "+job.getTruck().getModel());
		 System.out.println("---Sürücü Bilgileri---");
		 System.out.println("İsim : "+job.getTruck().getDriver().getName()+" "+job.getTruck().getDriver().getSurname());
		 System.out.println("Telefon  : "+job.getTruck().getDriver().getPhone());
		 System.out.println("---Aracı Bilgileri---");
		 System.out.println("İsim : "+job.getDispacher().getName()+" "+job.getDispacher().getSurname());
		 System.out.println("Telefon : "+job.getDispacher().getPhone());
		 System.out.println("E-Posta : "+job.getDispacher().getMail());
		}
	}

}
