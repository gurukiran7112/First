package java_programs;

public class Developer extends employee{

	public Developer(String ename, int id, double sal) {
		super(ename,id,sal);

	}

	public static void main(String[] args) {
		Developer d1=new Developer("Thamanna",111,400000);
		Developer d2=new Developer("Disha",000,300000);
		Developer d3=new Developer("Siddu",211,900000);
		
		System.out.println(d1.ename+","+d1.id+","+d1.sal);
		System.out.println(d2.ename+","+d2.id+","+d2.sal);
		System.out.println(d3.ename+","+d3.id+","+d3.sal);




	}

}
