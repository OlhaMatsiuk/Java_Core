package logos1;

public class Robot {
	private String name;
	private String work;
	
	Robot(){
		this.name = "Я Robot - ";
		this.work = "я просто працюю.";
	}
	
	Robot(String name, String work){
		this.name = name;
		this.work = work;
		
	}
	
	void work() {
		System.out.println(name + work);
	}

}
