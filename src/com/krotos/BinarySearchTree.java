package com.krotos;


/**
 * WAŻNE INFO
 *
 * Generyk T implementuje interfejs Comparable, który posiada metodę compareTo:
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html#compareTo-T-
 * Zamiast <, >, <=, >= należy użyć compareTo i sprawdzić int
 */
public class BinarySearchTree<T extends Comparable<T>> {

    private Node root;

    public void add(T value) {
        insert(root, value);
    }


    public void preOrder() {
        preOrder(root);
    }

    public void inOrder() {
        inOrder(root);
    }

    public void postOrder() {
        postOrder(root);
    }

    /**
     * ****************VLR***************
     * PRE-ORDER(wierzchołek_v)
     *  {
     *     print wierzchołek_v.wartość
     *     if wierzchołek_v.lewy_syn != null
     *        PRE-ORDER(wierzchołek_v.lewy_syn)
     *     if wierzchołek_v.prawy_syn != null
     *        PRE-ORDER(wierzchołek_v.prawy_syn)
     *  }
     */
    private void preOrder(Node node) {
        System.out.println(node.value);
        if(node.left!=null){
            preOrder(node.left);
        }
        if(node.right!=null){
            preOrder(node.right);
        }
    }

    /**
     * *************LVR*****************
     * IN-ORDER(wierzchołek_v)
     *  {
     *     if wierzchołek_v.lewy_syn != null
     *        IN-ORDER(wierzchołek_v.lewy_syn)
     *     print wierzchołek_v.wartość
     *     if wierzchołek_v.prawy_syn != null
     *        IN-ORDER(wierzchołek_v.prawy_syn)
     *  }
     */
    private void inOrder(Node node) {
        if(node.left!=null){
            inOrder(node.left);
        }
        System.out.println(node.toString());
        if(node.right!=null){
            inOrder(node.right);
        }
    }

    /**
     * **************LRV**********
     * POST-ORDER(wierzchołek_v)
     *  {
     *     if wierzchołek_v.lewy_syn != null
     *        POST-ORDER(wierzchołek_v.lewy_syn)
     *     jeżeli wierzchołek_v.prawy_syn != null
     *        POST-ORDER(wierzchołek_v.prawy_syn)
     *     wypisz wierzchołek_v.wartość
     *  }
     */
    private void postOrder(Node node) {
        if(node.left!=null){
            postOrder(node.left);
        }
        if(node.right!=null){
            postOrder(node.right);
        }
        System.out.println(node.value);
    }

    /**
     *insert(Node parent, T k):
     * if root = null
     *    root <- nowy węzeł z wartościa k
     * else if k <= parent.key
     *   if parent.left = null
     *       parent.left <- nowy węzeł z warością k
     *   else
     *      insert(parent.left, k)
     * else
     *   if parent.right = null
     *      parent.right <- nowy węzeł z wartością k
     *   else
     *      insert(parent.right, k)
     */
    private void insert(Node parent, T k) {
        if (root==null){
            root=new Node(k);
        }else if(k.compareTo(parent.value)==-1||k.compareTo(parent.value)==0){
            if (parent.left==null){
                parent.left=new Node(k);
            }else {
                insert(parent.left, k);
            }
        }else{
            if(parent.right==null){
                parent.right=new Node(k);
            }else{
                insert(parent.right,k);
            }
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }

    private class Node {
        Node left;
        Node right;
        T value;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}