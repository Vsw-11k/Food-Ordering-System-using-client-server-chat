import java.io.*;  
import java.net.*;
import java.util.Scanner; 
import java.util.ArrayList; 
class Myclient 
{  
    public static void main(String[] args) throws Exception
    {  
       Socket s=new Socket("localhost",8080);
       DataInputStream dinput=new DataInputStream(s.getInputStream());
       DataOutputStream doutput=new DataOutputStream(s.getOutputStream());
       Scanner scan=new Scanner(System.in);
       String str,str1,availfood;
       String choice,list1;
       String item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13,item14,item15,item16;
       String selected="",name="",address="",pnumber="";
       int amt=0;
       int k1,k3;
       str=dinput.readUTF();
       System.out.println(str);
       str1=dinput.readUTF();
       System.out.println(str1);
       availfood=dinput.readUTF();
       System.out.println(availfood);
       item1=dinput.readUTF();
       System.out.println(item1);
       item2=dinput.readUTF();
       System.out.println(item2);
       item3=dinput.readUTF();
       System.out.println(item3);
       item4=dinput.readUTF();
       System.out.println(item4);
       item5=dinput.readUTF();
       System.out.println(item5);
       item6=dinput.readUTF();
       System.out.println(item6);
       item7=dinput.readUTF();
       System.out.println(item7);
       item8=dinput.readUTF();
       System.out.println(item8);
       item9=dinput.readUTF();
       System.out.println(item9);	
       item10=dinput.readUTF();
       System.out.println(item10);
       item11=dinput.readUTF();
       System.out.println(item11);
       item12=dinput.readUTF();
       System.out.println(item12);	
       item13=dinput.readUTF();
       System.out.println(item13);      
       item14=dinput.readUTF();
       System.out.println(item14); 
       item15=dinput.readUTF();
       System.out.println(item15);
       item16=dinput.readUTF();
       System.out.println(item16);
       do{
        System.out.println("Select food items you need in terms of 1,2,3,etc:");
        int k=scan.nextInt();
       if(k==1){
        selected=selected.concat(" ").concat(item1);
        amt=amt+150;
       }
       else if(k==2){
       selected=selected.concat(" ").concat(item2);
       amt=amt+180;
       }
       else if(k==3){
       selected=selected.concat(" ").concat(item3);
       amt=amt+100;
       }
       else if(k==4){
       selected=selected.concat(" ").concat(item4);
       amt=amt+30;
       }
       else if(k==5){
       selected=selected.concat(" ").concat(item5);
       amt=amt+80;
       }
       else if(k==6){
       selected=selected.concat(" ").concat(item6);
       amt=amt+50;
       }
       else if(k==7){
       selected=selected.concat(" ").concat(item7);
       amt=amt+30;
       }
       else if(k==8){
       selected=selected.concat(" ").concat(item8);
       amt=amt+50;
       }
       else if(k==9){
       selected=selected.concat(" ").concat(item9);
       amt=amt+20;
       }
       else if(k==10){
       selected=selected.concat(" ").concat(item10);
       amt=amt+35;
       }
       else if(k==11){
       selected=selected.concat(" ").concat(item11);
       amt=amt+100;
       }
       else if(k==12){
       selected=selected.concat(" ").concat(item12);
       amt=amt+100;
       }
       else if(k==13){
       selected=selected.concat(" ").concat(item13);
       amt=amt+100;
       }
       else if(k==14){
       selected=selected.concat(" ").concat(item14);
       amt=amt+100;
       }
       else if(k==15){
       selected=selected.concat(" ").concat(item15);
       amt=amt+40;
       }
       else if(k==16){
       selected=selected.concat(" ").concat(item16);
       amt=amt+40;
       }
       else{
       System.out.println("Select the valid choice");
       }
       System.out.println("Items Selected:"+selected);
       System.out.println("Total amount is:"+amt);
       System.out.println("Do wish to add items press 1.Continue 2.exit");
       k1=scan.nextInt();
       }while(k1==1);
       doutput.writeUTF(selected);
       doutput.flush();
       doutput.writeInt(amt);
       doutput.flush();
       do{
       System.out.println("Enter Your name:");
       name=scan.next();
       System.out.println("Enter Your address for delivery:");
       address=scan.next(); 
       System.out.println("Enter your phone number:");
       pnumber=scan.next(); 
       System.out.println("Have you entered your details correctly press 1.yes 2.No");
       k3=scan.nextInt();
       }while(k3==2);
       doutput.writeUTF(name);
       doutput.flush();
       doutput.writeUTF(address);
       doutput.flush();
       doutput.writeUTF(pnumber);
       doutput.flush();
       System.out.println("Thankyou your food will reach you in 30 min!!!!");      
       doutput.close();
       s.close();
          
    }  
}  