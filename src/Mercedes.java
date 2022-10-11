public  class Mercedes extends Car{

    public String driveSound;

    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    @Override
    public String drive() {
        return null;
    }
}

