package Collection;

public class Student implements Cloneable{
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
    public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
    
    
    public static void main(String[] args) {
		
    	Student obj=new Student(101, "Suraj");
    	
    	try {
			Student s=(Student) obj.clone();
			System.out.println(s.id);
			System.out.println(s.name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}

}
