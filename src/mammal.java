public class mammal extends Animal{

    public mammal(){
        this.species = "Mammal";
    }

    @Override
    public void makeSound(){
        System.out.println("mammal sound");
    }
}
