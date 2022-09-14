public class Hero {
    private int hil;
    private int damage;
    private String attak;

    public Hero(int hil, String attak) {
        this.hil = hil;
        this.attak = attak;
    }

    public int getHil() {
        return hil;
    }

    public int getDamage() {
        return damage;
    }

    public String getAttak() {
        return attak;
    }

    public Hero(int hil, int damage, String attak) {
        this.hil = hil;
        this.damage = damage;
        this.attak = attak;
    }


    }

