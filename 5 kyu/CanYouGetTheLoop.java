import java.util.ArrayList;

public class LoopInspector {

  public int loopSize(Node node) {
    ArrayList<Node> loopArray = new ArrayList<Node>();
    
    while (!loopArray.contains(node)) {
      loopArray.add(node);
      node = node.getNext();
    }
    
    int firstIndex = Math.max(0, loopArray.indexOf(node));
    return loopArray.size() - firstIndex;
  } 
}

//:vault-boy-thumps-up:
