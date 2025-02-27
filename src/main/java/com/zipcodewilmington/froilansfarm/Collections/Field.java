package com.zipcodewilmington.froilansfarm.Collections;

import com.zipcodewilmington.froilansfarm.Produce.*;

import java.util.ArrayList;
import java.util.List;

final public class Field {
    private static Field INSTANCE;

    final private static List<CropRow> rows = new ArrayList<>();

    public static Field getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Field();
        }
        return INSTANCE;
    }

    private Field(){}

    public static List<CropRow> getRows() {
        return rows;
    }

    public static void addRow(CropRow row){
        rows.add(row);
    }

    public static void removeRow(int index){
        rows.remove(index);
    }
    public static Integer countFertilized (){
        Integer counter=0;
       // for(CropRow row:rows) if(row.isHasBeenFertilized())counter++;///////////////////
        return counter;
    }
    public static void clear(){
        for(int i=0;i<rows.size();i++){
            rows.remove(i);
        }
    }
}
