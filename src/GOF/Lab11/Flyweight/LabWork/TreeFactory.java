package GOF.Lab11.Flyweight.LabWork;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData,boolean isFruitTree) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData,isFruitTree);
            treeTypes.put(name, result);
        }
        return result;
    }
}
