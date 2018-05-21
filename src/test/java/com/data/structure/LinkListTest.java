package com.data.structure;

/**
 * Created by Administrator on 2018/5/17.
 */
public class LinkListTest {

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertLink("key01",1);
        list.insertLink("key05",5);
        list.insertLink("key10",10);
        list.insertLink("key15",15);
        System.out.println(list.displayLink());
        System.out.println(list.find("key10"));
        System.out.println(list.delete("key05"));
        System.out.println(list.displayLink());
    }
}
