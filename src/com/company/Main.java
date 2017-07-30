package com.company;

import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws MeExcertion  {
        try {
            try{
                throw new IOException("a");
            } finally {
                if (false){
                    throw new IOException("b");
                }
                System.err.println("c");
            }
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        } catch (Exception ex){
            System.err.println("d");
            System.err.println(ex.getMessage());
        }

    }
}

