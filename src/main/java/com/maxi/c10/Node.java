package com.maxi.c10;

/**
 * Created by maximus on 15-1-14.
 */
public class Node {

    private static final int ORDER = 4;
    private int numItems;
    private Node parent;
    private Node[] childArray  = new Node[ORDER];
    private DataItem[] itemArray = new DataItem[ORDER-1];

    public void connectChild(int childNum , Node child){
        childArray[childNum] = child;
        if (child != null) {
            child.parent = this;
        }
    }
    public Node disconnectChild(int childNum){
        Node tempNode = childArray[childNum];
        childArray[childNum] = null;
        return tempNode;

    }

    public Node getChild(int childNum){
        return childArray[childNum];
    }

    public Node getParent(){
        return parent;
    }

    public boolean isLeaf(){
        return (childArray[0] == null ? true: false);
    }

    public int getNumItems(){
        return numItems;
    }

    public boolean isFull(){
        return (numItems == ORDER-1)?true:false;
    }
    public int findItem(long key){
        for (int i = 0; i < ORDER-1; i++) {
            if (itemArray[i] == null){
                break;
            }else if (itemArray[i].dData ==key){
                return i;
            }
        }
        return -1;
    }
}
