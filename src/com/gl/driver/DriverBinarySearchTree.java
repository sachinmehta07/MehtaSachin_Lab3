package com.gl.driver;

import com.gl.services.Node;
import static com.gl.services.FindSumBST.findPair;
import static com.gl.services.FindSumBST.insert;

import java.util.HashSet;
import java.util.Set;

public class DriverBinarySearchTree {
    public static void main(String[] args)
    {
        int[] keys = { 40, 20, 10, 30, 60, 50, 70 };
        Node root = null;
        for (int key: keys) {
            root = insert(root, key);
        }

        int Sum = 130;

        Set<Integer> set = new HashSet<>();

        if (!findPair(root,Sum,set)) {
            System.out.println("nodes are not found");
        }
    }
}


