package Bridge;

public class CatVeterinar extends Veterinar{

    public CatVeterinar(Pet pet) {
        super(pet);
    }

    @Override
    public void carePet() {
       getPet().showPassport();
    }
}
