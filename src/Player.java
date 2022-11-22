import java.util.ArrayList;
import java.util.List;

public class Player implements  ISaveable {
    private String name;
    private String weapon;
    private int hitpoints;
    private int strength;

    public Player(String name,int hitpoints, int strength) {
        this.name = name;
        this.weapon = "sword";
        this.hitpoints = hitpoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitpoints);
        values.add(2, "" + this.strength);
        values.add(3, "" + this.weapon);

        return values;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0){
         this.name = list.get(0);
         this.hitpoints = Integer.parseInt(list.get(1));
         this.strength = Integer.parseInt(list.get(2));
         this.weapon = list.get(3);

        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                '}';
    }
}
