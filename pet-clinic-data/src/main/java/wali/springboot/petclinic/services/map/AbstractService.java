package wali.springboot.petclinic.services.map;

import wali.springboot.petclinic.models.BaseEntity;

import java.util.*;

public abstract class AbstractService <T extends BaseEntity,ID extends Long>{

    protected Map<Long,T> map =new HashMap<>();

    Set<T>findAll(){
        return  new HashSet<>(map.values());
    }

    T findById(ID id){
        return  map.get(id);
    }

    T save(T object)
    {
        if (object!= null)
        {
            if (object.getId()==null)
            {
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        }else {
            throw new RuntimeException("Object can't be null");
        }
        return  object;
    }

    void  deleteBYId(ID id)
    {
        map.remove(id);
    }

    void  delete(T object)
    {
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    public  Long getNextId()
    {
        Long nextId=null;
       try {
           nextId= Collections.max(map.keySet())+1;
       }
       catch (NoSuchElementException e)
       {
           nextId=1L;
       }
        return nextId;
    }

}
