package com.company;

public class HelloWorld {

    public static void main(String[] args) {

        boolean flag = true;
        if(flag == true){
            System.out.println("Value of flag is true");
        }else {
            System.out.println("Value of flag is false");
        }


        sayHello("Ivancho");
    }

    public HelloWorld(int age) {
        this.age = age;
    }

    String message = "hello";

    private int age = 5;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void sayHello(String name) {
        //TODO: to be executed once BUG-001 is fixed
        System.out.println("Hello " + name);

    }

    // This method will print Good bye message
    /*
    ijdoijaodj
    jsaojcs
    */

    public static void sayGoodBye (String name){

        //TODO: some additional validation to be added
            System.out.println("Good bye " + name + " test");
            String message = "hello";
        }
    }
