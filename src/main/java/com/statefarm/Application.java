package com.statefarm;

public class Application {
    public static void main(String[] args) {
        if(args.length == 2){
            String name = args[0];
            String email = args[1];
            System.out.println(name + " <" + email + ">");
        }
        if(args.length == 0) {
            System.out.println("Please specify a name and email.");
        }else if(args.length == 1){
            System.out.println("Please specify an email for " +args[0]);
        }

    }
}
