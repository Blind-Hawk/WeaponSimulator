package weapons;

public class firearm {
    private String name;
    private double caliber;
    private int firemode;
    private boolean foldable;

    public firearm(String name, double caliber, int firemode, boolean foldable) {
        this.name = name;
        this.caliber = caliber;
        this.firemode = firemode;
        this.foldable = foldable;
    }

    public String getName() {
        return name;
    }

    public double getCaliber() {
        return caliber;
    }

    public int getFiremode() {
        return firemode;
    }

    public boolean getFoldable() {
        return foldable;
    }

    public String fire() {
        return "Bang!";
    }

    public String fold() {
        return "Folded!";
    }

    public String unfold() {
        return "Unfolded!";
    }


}
