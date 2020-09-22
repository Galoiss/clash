package kata.clash.units;

public class Bomber extends Unit implements Run {
    public Bomber() {
        super(350,800,3,"WHEN YOU play with Explosives is dangerous bussiness");
    }

    @Override
    public int Move(int seconds) {
        this.run();
        return super.Move(seconds);
    }

    @Override
    public void run() {
        this.setCoveredDistance(6);
    }
}
