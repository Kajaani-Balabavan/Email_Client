package com.Email;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Update {
    public void updateFile(String recipient){
        FileWriter writer=null;
        BufferedWriter writer1= null;
        try{
            writer= new FileWriter("clientList.txt",true);
            writer1= new BufferedWriter(writer);
            writer1.write(recipient);
            writer1.newLine();   
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if(writer1 != null){
                try{
                    writer1.close();
                    writer=null;
                } catch (Exception ignoreMe){}
                writer1=null;
            }
            if(writer != null){
                try{
                    writer.close();
                } catch (Exception ignoreMe){}
                writer=null;
            }
        }
    }

}
