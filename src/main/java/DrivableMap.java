/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */
    public boolean addDrivable(String ID, Drivable o) {
        if (!this.drivable_map.containsKey(ID)) {
            this.drivable_map.put(ID, o);
            return true;
        }
        return false;
    }




    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed) {
        Collection<Drivable> values = this.dirvable_map.values;
        List<Drivable> speeds = new ArrayList<Drivable>(values);
        for (Drivable i: speeds) {
            if (i.getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }





    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public List<Tradable> getTradable() {
        Collection<Drivable> values = this.dirvable_map.values;
        List<Drivable> items = new ArrayList<Drivable>(values);
        List<Tradable> l = new ArrayList<Tradable>();
        for (Drivable i: items) {
            if (i instanceof Tradable) {
                l.add(((Tradable) i));
            }
        }
        return l;
    } 



    
}
