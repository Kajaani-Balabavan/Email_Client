package com.Email;

import java.io.*;
import java.util.ArrayList;

public class Ser_Deser {
    public static void serialize(ArrayList<ComposeEmail> mail){
        FileOutputStream fout = null;
        ObjectOutputStream oout= null;
        try{
            fout= new FileOutputStream("obj.ser");
            oout = new ObjectOutputStream(fout);
            oout.writeObject(mail);
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(oout != null){
                try{
                    oout.close();
                    fout=null;
                } catch (Exception ignoreMe){}
                oout=null;
            }
            if(fout != null){
                try{
                    fout.close();
                } catch (Exception ignoreMe){}
                fout=null;
            }
        }
    }
    public static ArrayList<ComposeEmail> deserialize() {
        ArrayList<ComposeEmail> mails = new ArrayList<>();
        FileInputStream fin=null;
        ObjectInputStream oin= null;
        try
        {
            fin = new FileInputStream("obj.ser");
            oin = new ObjectInputStream(fin);
            mails= (ArrayList<ComposeEmail>) oin.readObject();
        } catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            if(oin != null){
                try{
                    oin.close();
                    fin=null;
                } catch (Exception ignoreMe){}
                oin=null;
            }
            if(fin != null){
                try{
                    fin.close();
                } catch (Exception ignoreMe){}
                fin=null;
            }
        }
        return mails;
    }
}

