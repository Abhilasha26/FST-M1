package com.Activities.Activity5;

public class Activity5 {

public static void main(String[] args) {
    String title= "Sport Cars Collection";
    Book newNovel= new MyBook();
    newNovel.setTitle(title);
    String extractTitle= newNovel.getTitle();

    System.out.println("Extracted Title is: " + extractTitle );
    
}
}
