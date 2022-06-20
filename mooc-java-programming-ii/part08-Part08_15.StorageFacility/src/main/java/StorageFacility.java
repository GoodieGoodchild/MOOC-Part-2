
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> filingCabinet;
    private ArrayList<String> contents;
    
    public StorageFacility() {
        this.filingCabinet = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.filingCabinet.putIfAbsent(unit, new ArrayList<>());
        this.filingCabinet.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyList = new ArrayList<>();

        return this.filingCabinet.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item) {
        //removes the given item from the given storage unit. 
        //NB! Only removes one item — 
        //if there are several items with the same name, the rest still remain. 
        this.filingCabinet.get(storageUnit).remove(item);

        if (this.filingCabinet.get(storageUnit).isEmpty()) {
            this.filingCabinet.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){

        ArrayList<String> storageKeys = new ArrayList<>();
        for(String e: filingCabinet.keySet()){
            if(!filingCabinet.get(e).isEmpty()){
                storageKeys.add(e);
            }
        }
        return storageKeys;
    }

}
