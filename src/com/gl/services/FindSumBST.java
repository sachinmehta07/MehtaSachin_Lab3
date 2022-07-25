package com.gl.services;

import java.util.Set;

public class FindSumBST {

    public static Node insert(Node root, int key)
    {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        }

        else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Function to find a pair with a given sum in the BST
    public static boolean findPair(Node root, int Sum, Set<Integer> set)
    {
        if (root == null) {
            return false;
        }
        if (findPair(root.left, Sum, set)) {
            return true;
        }
        if (set.contains(Sum - root.data))
        {
            System.out.println("Pair is (" + (Sum - root.data) + ", "
                    + root.data + ")");
            return true;
        }
        else {
            set.add(root.data);
        }
        return findPair(root.right, Sum, set);
    }
}
