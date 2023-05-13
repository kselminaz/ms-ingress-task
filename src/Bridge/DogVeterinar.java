package Bridge;

public class DogVeterinar extends Veterinar{

    public DogVeterinar(Pet pet) {
        super(pet);
    }

    @Override
    public void carePet() {
       getPet().showPassport();
    }
}
