package com.goit.hw4;

public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    private boolean isCanRefill(int ammount) {
        return (ammount <= 0 || ammount > 100);
    }

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (isCanRefill(bigRocketCount))
            return;

        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (isCanRefill(smallRocketCount))
            return;
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket() {
        if (getBigRocketCount() > 0) {
            System.out.println("Launch big rocket");
            setBigRocketCount(getBigRocketCount()-1);
        }
    }

    public void launchSmallRocket() {
        if (getSmallRocketCount() > 0) {
            System.out.println("Launch small rocket");
            setSmallRocketCount(getSmallRocketCount() - 1);
        }
    }

    public int getTotalPower() {
        return getBigRocketCount()*100 + (getSmallRocketCount()*50);
    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());
    }
}

