package jtm.activity06;

public class Martian implements Humanoid, Alien, Cloneable {

    private int weight;
    private boolean alive;
    private String[] backpack;

    public Martian() {
        this.weight = 42;
        this.alive = true;
        this.backpack = new String[10];
    }

    @Override
    public void eatHuman(Humanoid humanoid) {
        if (Humanoid.isAlive() == "Alive") {
            Humanoid.killHimself();
            this.weight = this.weight + humanoid.getWeight();
        }
    }

        @Override
        public int getLegCount () {
            return LEG_COUNT;
        }

        @Override
        public int getWeight () {
            return this.weight;
        }

        @Override
        public void setWeight ( int weight){
            this.weight = weight;
        }

        @Override
        public String killHimself() {
            this.alive = true;
            return "I AM IMMORTAL!";
        }

        @Override
        public int getArmCount () {
            return ARM_COUNT;
        }

        @Override
        public String[] getBackpack () {
            return this.backpack;
        }

        @Override
        public void addToBackpack (String item){
            for (int i = 0; i < this.backpack.length; i++) {
                if (this.backpack[i] == null) {
                    this.backpack[i] = item;
                    break;
                }
            }
        }

        @Override
        public String isAlive () {
            this.alive = true;
            return "I AM IMMORTAL!";
        }


        @Override
        protected Object clone () throws CloneNotSupportedException {
            //TODO
            Martian m = new Martian();
            m.setWeight(this.getWeight());
            return m;
        }

        private int setArmCount ( int armCount){
            return this.setArmCount(armCount);
        }

    }
}
