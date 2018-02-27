import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Homework {
  public static void main(String... args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

    Map<String, Object> tree0 = new HashMap<String, Object>();
    tree0.put("type", "oak");
    tree0.put("leafcolor", Color.green);
    tree0.put("age", 2);
    tree0.put("sex", "male");
    map.add(tree0);

    Map<String, Object> tree1 = new HashMap<String, Object>();
    tree1.put("type", "pine");
    tree1.put("leafcolor", Color.green);
    tree1.put("age", 11);
    tree1.put("sex", "female");
    map.add(tree1);

    Map<String, Object> tree2 = new HashMap<String, Object>();
    tree2.put("type", "birch");
    tree2.put("leafcolor", Color.green);
    tree2.put("age", 51);
    tree2.put("sex", "male");
    map.add(tree2);

    Map<String, Object> tree3 = new HashMap<String, Object>();
    tree3.put("type", "cherry");
    tree3.put("leafcolor", Color.green);
    tree3.put("age", 53);
    tree3.put("sex", "female");
    map.add(tree3);

    Map<String, Object> tree4 = new HashMap<String, Object>();
    tree4.put("type", "maple");
    tree4.put("leafcolor", Color.green);
    tree4.put("age", 74);
    tree4.put("sex", "male");
    map.add(tree4);
  }
}