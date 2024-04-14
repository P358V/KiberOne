public class Tramsformer {
    private StringBuilder name;
    private Gun leftGun;
    private Gun rightGun;


    public void setName(String name) {
        this.name = new StringBuilder(name);
    }

    public void setLeftGun(Gun leftGun) {
        this.leftGun = leftGun;
    }

    public void setRightGun(Gun rightGun) {
        this.rightGun = rightGun;
    }

    public String getName() {
        return name.toString();
    }
}
