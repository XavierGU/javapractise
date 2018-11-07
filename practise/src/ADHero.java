public class ADHero extends Hero {
    public void attack(){
        System.out.println(name+"进行了一次攻击");
    }
    public void attack(Hero...heroes){
        for (int i = 0;i<heroes.length;i++){
            System.out.println(name+"攻击了"+heroes[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";
        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";
        bh.attack(h1);
        bh.attack(h1,h2);
    }
}
