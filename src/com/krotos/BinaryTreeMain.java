package com.krotos;


class BinaryTreeMain {
    private BinarySearchTree<Integer> binarySearchTree;

    public static void main(String[] args) {
        BinaryTreeMain main = new BinaryTreeMain();
        main.prepare();
        //System.out.println(main.toString());

        //PRE ORDER
        main.binarySearchTree.preOrder();

        //IN ORDER
        main.binarySearchTree.inOrder();

        //POST ORDER
        main.binarySearchTree.postOrder();

        MapText.toMap("tekstotroniki Bobowe");
        System.out.println("NWD: "+NWD.calc(2,45));


    }

    private void prepare() {
        binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(3);
        binarySearchTree.add(6);
        binarySearchTree.add(1);
        binarySearchTree.add(10);
    }
}