package com.company;
class cellphone{
    public void ringing() {
        System.out.println("cellphone ringing sound");
    }
        public void vibrating() {
            System.out.println("....vibrating");

         }
         public void callfriend() {
             System.out.println("calling my friend harsh gujjar");
         }
         }
         public class MethodWithCellPhonePrint {
    public static void main(String[] args) {
        cellphone vivoy20=new cellphone();
        vivoy20.callfriend();
            vivoy20.vibrating();
            vivoy20.ringing();

    }
}
