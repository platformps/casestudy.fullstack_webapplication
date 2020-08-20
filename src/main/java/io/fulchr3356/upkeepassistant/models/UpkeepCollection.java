package io.fulchr3356.upkeepassistant.models;
import java.util.HashMap;

public class UpkeepCollection<CollectionType> {
    HashMap<String, CollectionType> collection;
    public UpkeepCollection(HashMap<String, CollectionType> collection){
        this.collection = collection;
    }
    public UpkeepCollection() {
        this(new HashMap<>());
    }

    public void add(String objectName,CollectionType object){
        if(collection.containsKey(objectName))
            return;
        collection.put(objectName,object);
    }


    public void delete(String id){
        collection.remove(id);
    }

    public void update(String id ,CollectionType newObject){
        collection.put(id,newObject);
    }

    public void listAll(){
        collection.forEach((name,object) -> System.out.println(name));
    }

    public HashMap<String,CollectionType> getCollection(){
        return collection;
    }
}
