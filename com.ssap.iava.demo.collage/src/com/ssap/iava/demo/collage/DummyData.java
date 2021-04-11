package com.ssap.iava.demo.collage;



public class DummyData {

    static Department deparments[] = new Department[2];
    static Professor professors[] = new Professor[2];
    
    static {
    	
    	
    	Student student1[] = new Student[5];
    	
    	Address adress0 = new Address("pune1","mh",50);
    	student1[0] = new Student(11,"surabhi1","ETC",adress0,"FEMALE");
    	
    	Address adress1 = new Address("satara","mh",54);
    	student1[1] = new Student(11,"surabhi2","ETC",adress1,"FEMALE");
    	
    	Address adress2 = new Address("karad","mh",504);
    	student1[2] = new Student(11,"surabhi3","ETC",adress2,"FEMALE");
    	
    	Address adress3 = new Address("katraj","mh",5054);
    	student1[3] = new Student(11,"surabhi4","ETC",adress3,"FEMALE");
    	
    	Address adress4 = new Address("umbraj","mh",5065);
    	student1[4] = new Student(11,"surabhi5","ETC",adress4,"FEMALE");
    	
    	Student student2[] = new Student[2];
    	
    	Address adress5 = new Address("mumbau","mh",980);
    	student2[0] = new Student(11,"surabhi1","ETC",adress5,"FEMALE");
    	
    	Address adress6 = new Address("nashik","mh",534);
    	student2[1] = new Student(11,"surabhi2","ETC",adress6,"FEMALE");
    	
    	
    	deparments[0] = new Department("ETC", student1);
    	deparments[1] = new Department("IT", student2);
    	
    	Address profAdd1 = new Address("baglore","ka",980);
    	Professor pro1 = new Professor(01,"ABC","ETC",profAdd1);
    	
    	Address profAdd2 = new Address("Delhi","DL",980);
    	Professor pro2 = new Professor(02,"PQR","IT",profAdd2);
    
    	
    }
    
	
	
	
	
	
	public DummyData() {
		// TODO Auto-generated constructor stub
	}

}
