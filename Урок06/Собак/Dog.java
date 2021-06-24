
public abstract class Dog extends Animal {

    @Override
    public boolean jump(double jump) {
        return (jump > 0 && jump <= 0.5);
    }
