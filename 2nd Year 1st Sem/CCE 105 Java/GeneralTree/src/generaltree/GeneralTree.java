/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaltree;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */

class TreeNode<T>{
    
    T data; 
    List<TreeNode<T>> children; 

    public TreeNode(T data){
        
        this.data = data;
        this.children = new ArrayList<>();
        
    }

    public void addChild(TreeNode<T> child){
        
        this.children.add(child);
        
    }

    public void display(String prefix){
        
        System.out.println(prefix + data);
        
        for (TreeNode<T> child : children){
            
            child.display(prefix + "--"); 
            
        }
    }
}

public class GeneralTree<T> {
    /**
     * @param args the command line arguments
     */
    private TreeNode<T> root;

    public GeneralTree(T rootData){
        
        root = new TreeNode<>(rootData);
        
    }

    public TreeNode<T> getRoot(){
        
        return root;
        
    }

    public void displayTree(){
        
        if (root != null){
            
            root.display("");
            
        }
    }

    public static void main(String[] args){
        
        GeneralTree<String> tree = new GeneralTree<>("Root");

        TreeNode<String> child1 = new TreeNode<>("Child 1");
        TreeNode<String> child2 = new TreeNode<>("Child 2");
        tree.getRoot().addChild(child1);
        tree.getRoot().addChild(child2);

        child1.addChild(new TreeNode<>("Child 1.1"));
        child1.addChild(new TreeNode<>("Child 1.2"));

        child2.addChild(new TreeNode<>("Child 2.1"));

        System.out.println("Tree structure:");
        tree.displayTree();
        
    }
}

