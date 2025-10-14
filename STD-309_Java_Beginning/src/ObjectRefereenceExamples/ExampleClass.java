package ObjectRefereenceExamples;

public class ExampleClass {

   private String name;

   public ExampleClass(String name){
       this.name = name;
   }

   public ExampleClass(){

   }

   public String sendName(){
       return name;
   }

   public void changeName(String name){
       this.name = name;
   }


   public void copyObject(ExampleClass e){
       this.name = e.name;
   }

    @Override
    public String toString() {
        return "ObjectRefereenceExamples.ExampleClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
