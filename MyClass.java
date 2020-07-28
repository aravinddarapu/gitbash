class OuterClass{
 int x = 10;

   class InnerClass{
     public int myInnermethod(){
        return x;
     }

public class MyMainClass{

public static void main(String[]args){

OuterClass myOuter = new OuterClass();
OuterClass.InnerClass myInner = myOuter.new InnerClass();

System.out.println(myInner.myInnermethod());
   }
 }
}