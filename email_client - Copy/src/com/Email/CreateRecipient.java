package com.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateRecipient {
    Create doc= new Create();
    ArrayList<IBDayWish> birthdayBabies = new ArrayList<>();
    public ArrayList<IBDayWish> create(){
        FileReader reader=null;
        BufferedReader reader1=null;
        try{
            reader= new FileReader("clientList.txt");
            reader1= new BufferedReader(reader);
            String line=null;
            Recipients recipient;
            while ((line=reader1.readLine())!=null){
                recipient= doc.addRecipient(line);
                if (recipient instanceof IBDayWish){
                    birthdayBabies.add((IBDayWish) recipient);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(reader1 != null){
                try{
                    reader1.close();
                    reader=null;
                } catch (Exception ignoreMe){}
                reader1=null;
            }
            if(reader != null){
                try{
                    reader.close();
                } catch (Exception ignoreMe){}
                reader=null;
            }
        }
        return birthdayBabies;
    }
}
