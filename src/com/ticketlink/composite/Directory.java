package com.ticketlink.composite;

import com.ticketlink.factorymethod.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ChangYong on 2016. 7. 5..
 */
public class Directory {
    private String name;
    private int depth = 0;
    private List<Object> entries = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void addEntry(Object entry){
        this.entries.add(entry);

        if(entry instanceof File){
            ((File) entry).setDepth(this.depth + 1);
        }
        if(entry instanceof Directory){
            ((Directory) entry).setDepth(this.depth + 1);
        }
    }

    private void setDepth(int depth){
        this.depth = depth;
    }

    public void removeEntry(Object entry){
        this.entries.remove(entry);
    }

    public String getName(){
        return this.name;
    }

    public int getSize(){
        int size = 0;

        for(Object entry : this.entries){
            if(entry instanceof File){
                size += ((File) entry).getSize();
            }

            if(entry instanceof Directory){
                size += ((Directory) entry).getSize();
            }
        }

        return size;
    }

    public void print(){
        for(int i = 0; i < this.depth; i++){
            System.out.println("\n");
        }

        System.out.println("[Directory] " + this.name + ", Size: " + this.getSize());

        for(Object entry : this.entries){
            if(entry instanceof File){
                ((File) entry).print();
            }

            if(entry instanceof Directory){
                ((Directory) entry).print();
            }
        }
    }
}
