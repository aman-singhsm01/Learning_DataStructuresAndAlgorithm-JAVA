package com;

public class New {


    public static void main(String[] args) {
        boolean a =true;
        boolean b =false ;
        if( a)
        {
            System.out.println("A");
        }
        else if(a && b)
        {
            System.out.println( "A && B");
        }
        else
        {
            if ( !b )
            {
                System.out.println( "notB") ;
            }
            else
            {
                System.out.println("OMG the end") ;
            }
        }
    }
}
