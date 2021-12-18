package com.company.models;

import java.util.Arrays;

public class ERPSystem {
    private User []memory = new User[1000];
    private int sizeOfUsers = 0;

    public ERPSystem() {
    }

    public ERPSystem(User[] memory, int sizeOfUsers) {
        this.memory = memory;
        this.sizeOfUsers = sizeOfUsers;
    }

    public void addUser(User user){
        memory[sizeOfUsers] = user;
        sizeOfUsers++;
    }

    public String printAllUsers() {
        return "ERPSystem{" +
                "memory=" + Arrays.toString(memory) +
                '}';
    }

    public void printUser(int index){
        if(index <= sizeOfUsers && index > -1){
            System.out.println(memory[index]);
        }else {
            System.out.println("No user in this index");
        }
    }
}
