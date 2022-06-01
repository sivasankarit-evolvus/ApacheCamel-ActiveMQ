package com.ford.pfs.movis.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadWriteProgram {
            public static void main(String args[]){
            try{
                File inputFile = new File("C:\\tmp\\testIn.txt");
                File outputFile = new File("C:\\tmp\\testOut.txt");
                FileInputStream fin=new FileInputStream(inputFile);
                FileOutputStream fout=new FileOutputStream(outputFile);
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);
                    fout.write((char)i);
                }
                fin.close();
                fout.close();
            }catch(Exception e){System.out.println(e);}
        }
    }