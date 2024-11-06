public class bird extends Animal{

    public bird() {
        this.species = "bird";
    }

    @Override
    public void makeSound(){
        System.out.println("Chirp Chirp");
    }
}
