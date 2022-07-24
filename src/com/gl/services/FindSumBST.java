package com.gl.services;

import java.util.Set;

public class FindSumBST {
    // Recursive function to insert a key into a BST
    public static Node insert(Node root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new Node(key);
        }

        // if the given key is less than the root node, recur for the left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        // if the given key is more than the root node, recur for the right subtree
        else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Function to find a pair with a given sum in the BST
    public static boolean findPair(Node root, int Sum, Set<Integer> set)
    {
        // base case
        if (root == null) {
            return false;
        }

        // return true if pair is found in the left subtree; otherwise, continue
        // processing the node
        if (findPair(root.left, Sum, set)) {
            return true;
        }

        // if a pair is formed with the current node, print the pair and return true
        if (set.contains(Sum - root.data))
        {
            System.out.println("Pair is (" + (Sum - root.data) + ", "
                    + root.data + ")");
            return true;
        }

        // insert the current node's value into the set
        else {
            set.add(root.data);
        }

        // search in the right subtree
        return findPair(root.right, Sum, set);
    }
}
