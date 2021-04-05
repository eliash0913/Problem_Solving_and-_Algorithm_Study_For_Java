package Basics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {
    void synchronizedCollection(){
        List syncListExample = Collections.synchronizedList(new ArrayList());
    }

    void unmodifiableCollection(){
        List modifiableListExample = new ArrayList();
        List unmodifiableListExample = Collections.unmodifiableList(modifiableListExample);
    }

    void singletonCollection(){
        List singletonListExample = Collections.singletonList(SingletonClass.getInstance());
    }

    void checkedCollection(){ //this is old way. Use generic for new.
        List list = new ArrayList();
        List checkedListExample = Collections.checkedList(list, Integer.TYPE);
    }






}

class SingletonClass{
    private static SingletonClass singletonClass = new SingletonClass();
    private SingletonClass(){
    }

    public static SingletonClass getInstance(){
        if(singletonClass==null)
            singletonClass = new SingletonClass();
        return singletonClass;
    }
}

class GenericExample<T>{
    T value;

    void setValue(T newValue){
        value = newValue;
    }

    T getVaue(){
        return value;
    }
}

class ParentClassExample{

}

interface ParentableExample{
    void parenting();
}

class Child1ClassExample extends ParentClassExample{ }
class Child2ClassExample extends ParentClassExample{ }

class GenericLimitedExample<T extends ParentClassExample>{
    T value;

    void setValue(T newValue){
        value = newValue;
    }

    T getVaue(){
        return value;
    }
}

class GenericLimitedExample1<T extends ParentClassExample & ParentableExample>{
    T value;

    void setValue(T newValue){
        value = newValue;
    }

    T getVaue(){
        return value;
    }
}

class GenericLimitedExample2<T>{
    Child2ClassExample value;

    <T extends ParentClassExample> void setValue(Child2ClassExample newValue){
        value = newValue;
    }

    <T extends ParentClassExample> Child2ClassExample getVaue(){
        return value;
    }
}