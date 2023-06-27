package Bridge;

public abstract class Veterinar {
    private final Pet pet;
    public Veterinar(Pet pet){
        this.pet=pet;
    }
    public abstract void carePet();
    public Pet getPet(){
        return pet;
    }
}
