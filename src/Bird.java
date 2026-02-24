import part2.IFlyable;

public class Bird implements IFlyable {
    @Override
    public boolean flyable() {
        return true;
    }

    public static void main(String[] args) {
        IFlyable chicken = new Bird();
        chicken.flyable();
    }
}
