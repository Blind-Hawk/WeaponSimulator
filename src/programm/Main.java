package programm;
import weapons.firearm;
import weaponparts.magazine;

public class Main {
    public static void main(String[] args) {
        firearm testGun = new firearm("TestGun",9.19, 0, false);
        magazine testMag = new magazine("TestMag", 9.19, 10);
        System.out.println(testMag.loadMag(20) + "\n");
        System.out.println(testMag.unloadMag(5) + "\n");
        System.out.println(testMag.loadMag(4) + "\n");
    }
}
