public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setDamage(50);
    boss.setHelth(250);
    boss.setDefence("magic");
        System.out.println(boss.getDamage());
        System.out.println(boss.getHelth());
        System.out.println(boss.getDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getDamage());
            System.out.println(createHeroes()[i].getAttak());
            System.out.println(createHeroes()[i].getHil());
        }
    }
    public static Hero[] createHeroes(){
        Hero lolik = new Hero(230, 60, "magic");
        Hero lolker = new Hero(210, "fire");
        Hero lolka = new Hero(270, "telekinesis");
        Hero [] Heroes = {lolik, lolker, lolka};
        return Heroes;
        




    }
}