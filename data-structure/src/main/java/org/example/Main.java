package org.example;

public class Main {
    public static void main(String[] args) {
        HashTableImpl hashTable = new HashTableImpl();
        hashTable.insert(1, 1);
        hashTable.insert(3, 2);

        hashTable.remove(1);
        System.out.println(hashTable.search(1));
    }
}