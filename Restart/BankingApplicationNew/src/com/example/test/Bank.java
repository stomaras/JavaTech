package com.example.test;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            System.out.println("New Branch added with name : " + branchName);
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

}
