package com.ticketlink.composite;

/**
 * Created by ChangYong on 2016. 7. 5..
 */
public class File {
    private String name;
    private int size;
    private int depth = 0;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    public void setDepth(int depth){
        this.depth = depth;
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        return this.size;
    }

    public void print(){
        for(int i = 0; i < depth; i++){
            System.out.println("\t");
        }

        System.out.println("[File] " + this.name + ", Size: " + this.size);
    }
}
