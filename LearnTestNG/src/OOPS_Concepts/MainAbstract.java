package OOPS_Concepts;

public class MainAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DogAbstract_2 dog=new DogAbstract_2("Bruno");
		dog.eat();
		dog.breathe();

	//	BirdAbstract bird=new BirdAbstract("Duck");
	//	bird.eat();
	//	bird.breathe();

		ParrotAbstract_3 parrot=new ParrotAbstract_3("Parrot");
		parrot.eat();
		parrot.breathe();
		parrot.fly();
	}

}
