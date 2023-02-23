package weaponparts;

public class magazine {
    private String name;
    private double caliber;
    private int capacity;
    private int currentAmmo;
    public magazine(String name, double caliber, int capacity) {
        this.name = name;
        this.caliber = caliber;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public double getCaliber() {
        return caliber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String loadMag(int amountOfBullets){
        int initalCountOfAmmo = amountOfBullets;

        if (currentAmmo >= capacity) {
            return "Magazine is full!";
        }
        else {
            for(; currentAmmo < capacity && amountOfBullets > 0; currentAmmo++){
                amountOfBullets--;
            }
        }
        return "Magazine loaded with: "+ initalCountOfAmmo + " and " + amountOfBullets + " are left " + currentAmmo + " ammo is left in the magazine!";
    }

    public String unloadMag(int amountofBullets){
        int gainedAmmo = 0;

        if (0 >= currentAmmo) {
            return "Magazine is empty!";
        }
        else {
            for(int i = amountofBullets; i > 0; i--){
                if(currentAmmo <= 0){
                    gainedAmmo = amountofBullets - i;
                    return "Magazine is empty with " + gainedAmmo + " bullets gained!";
                }
                currentAmmo--;
                gainedAmmo++;
            }
        }
        return  "Magazine unloaded with: " + gainedAmmo + " and " + currentAmmo + " ammo is left in the magazine!";
    }
}
