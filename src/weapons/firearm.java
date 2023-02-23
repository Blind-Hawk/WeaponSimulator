package weapons;

public class firearm {
    private String weaponName;
    private String weaponClass;
    private double caliber;
    private int firemode;
    private boolean foldable;

    public firearm(String name, String weaponClass, double caliber, int firemode, boolean foldable) {
        this.weaponName = name;
        this.weaponClass = weaponClass;
        this.caliber = caliber;
        this.firemode = firemode;
        this.foldable = foldable;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getWeaponClass() {
        return weaponClass;
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
