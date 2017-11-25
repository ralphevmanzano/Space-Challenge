/**
 * Created by ralphemerson on 11/23/2017.
 */
public interface SpaceShip {
    boolean launch();

    boolean land();

    boolean canCarry(Item item);

    void carry(Item item);
}
