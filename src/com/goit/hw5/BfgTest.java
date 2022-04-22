package com.goit.hw5;

class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}

class BFG {
    private int ammo;
    private int damage;
    private String name;


    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BFG() {
        this(1000,50,"BFG");
    }

    public BFG(int ammo, int damage, String name) {
        this.setAmmo(ammo);
        this.setDamage(damage);
        this.setName(name);
    }

    public BFG(int ammo) {
        this(ammo,50,"BFG");
    }

    public BFG(int ammo, int damage) {
        this(ammo,damage,"BFG");
    }


    @Override
    public String toString() {
        return String.format("%s, ammo: %d, damage: %d",this.name,this.ammo,this.damage);
    }

}