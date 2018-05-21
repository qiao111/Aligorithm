package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class LinkList {

    class Link{
        private String key ;

        private int value;

        private Link next;

        public Link(String key,int value){
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Link getNext() {
            return next;
        }

        public void setNext(Link next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" + this.key + "," + this.value+ "]";
        }
    }

    private Link first ;

    public LinkList(){}

    public void insertLink(String key,int value){
        Link link = new Link(key,value);
        link.setNext(getFirst());
        setFirst(link);
    }
    public String displayLink(){
        StringBuilder builder = new StringBuilder();
        Link current = first;
        while(current != null){
            builder.append(current.toString());
            current = current.getNext();
        }
        return builder.toString();
    }

    public int find(String key){
        Link current = first;
        while(current != null){
            if(current.getKey().equals(key)){
                return current.getValue();
            }else{
                current = current.getNext();
            }
        }
        return -1;
    }

    public Link delete(String key){
        Link current = first;
        Link previous = first;
        while(!current.getKey().equals(key)){
            if(current.getNext() == null){
                return null;
            }else{
                previous = current;
                current =current.getNext();
            }
        }
        if(current == first){
            first = first.getNext();
        }else{
            previous.next = current.getNext();
        }
        return current;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }
}
