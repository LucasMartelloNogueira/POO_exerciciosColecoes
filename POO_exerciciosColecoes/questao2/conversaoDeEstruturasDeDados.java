package questao2;

import java.util.*;

public class conversaoDeEstruturasDeDados {
    
    public static <T> HashSet<T> converterParaHashSet(Collection<T> collection){
        HashSet<T> hashSet = new HashSet<>(collection);
        return hashSet;
    }

    public static <T> PriorityQueue<T> converterParaPriorityQueue(Collection<T> collection){
        PriorityQueue<T> priorityQueue = new PriorityQueue<>(collection);
        return priorityQueue;
    }

    public static <T> ArrayDeque<T> converterParaArrayDeque(Collection<T> collection){
        ArrayDeque<T> arrayDeque = new ArrayDeque<>(collection);
        return arrayDeque;
    }

    public static <T> TreeSet<T> converterParaTreeSet(Collection<T> collection){
        TreeSet<T> treeSet = new TreeSet<>(collection);
        return treeSet;
    }
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lucas");
        arrayList.add("Valesca");
        arrayList.add("Leo");
        
        HashSet hashSet = converterParaHashSet(arrayList);
        PriorityQueue priorityQueue = converterParaPriorityQueue(hashSet);
        ArrayDeque arrayDeque = converterParaArrayDeque(priorityQueue);
        TreeSet treeSet = converterParaTreeSet(arrayDeque);

        System.out.println("arrayList: " + arrayList);
        System.out.println("hashSet: " + hashSet);
        System.out.println("priorityQueue: " + priorityQueue);
        System.out.println("arrayDeque: " + arrayDeque);
        System.out.println("treeSet: " + treeSet);

        // resposta: as ordens de aparição nos prints são diferentes porque cada classe
        // que implementa a interface collection trata de maneira arbitraria os elementos
        // que estão inseridos, cada uma tem a sua maneira de organizar os elementos dentro dela

    }
}
