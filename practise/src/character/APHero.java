package character;

public class APHero extends Hero implements AP{
    @Override
    public void magicAttack() {
        System.out.println("魔法攻击！");
    }
}
