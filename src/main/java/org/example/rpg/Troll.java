package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    // Bleedable interface'inin metodu
    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    // Poisonable interface'inin metodu
    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    // Monster sınıfındaki abstract attack metodunu implement ediyoruz
    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
}
