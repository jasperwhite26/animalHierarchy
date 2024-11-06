public class dog extends mammal{

    public dog(){
        this.species = "dog";
    }

    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}
