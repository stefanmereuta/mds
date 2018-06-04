package game;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    
    List<List<Boolean>> ship;
    
    public List<List<Boolean>> getShape(int rotation) {
        List<List<Boolean>> ret;
        
        /*if (rotation == 0) {
            ret = new ArrayList<>();
            
            for (int i = 0; i < ship.size(); ++i) {
                ret.add(new ArrayList<>());
            }
            
            for (int i = 0; i < ship.size(); ++i) {
                for (int j = 0; j < )
            }
            //ret = new Boolean[ship.length][ship[0].length];
        } else if (rotation == 90) {
            ret = new Boolean[ship[0].length][ship.length];
            for (int i = 0; i < ship[0].length; ++i) {
                for (int j = 0; j < ship.length; ++j) {
                    
                }
            }
        }*/
        
        return ship;
        /*return rotated*/
    }
    
}
