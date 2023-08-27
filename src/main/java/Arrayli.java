import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrayli {
   /* public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        List<String> queries = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int noOfLines = Integer.valueOf(scanner.nextLine());

        for(int line=0;line<noOfLines;line++){
            String lineAtIndex = scanner.nextLine();
            lines.add(lineAtIndex);
        }
        int noOfQueries = scanner.nextInt();
        for(int line=0;line<noOfQueries;line++){
            String query = scanner.nextLine();
            queries.add(query);
        }

        queries.forEach(q->{
            String[] arr= q.split(" ");
            String line = lines.get(Integer.valueOf(arr[0]));
            if(null != line){
                try{
                    char val =line.charAt(Integer.valueOf(arr[1]));

                    System.out.println(val);
                }catch(Exception ex){
                    System.out.println("ERROR");
                }


            }
        });
    }*/

    class Math{
        int add(int a, int b){ return a+b;}
        //Overloaded Method
        int add(int a, int b, int c){return a+b+c; }
    }


    class Bank {
        double getRateOfInterest(){return 0d;}
    }

    class CentralBank extends Bank {
        @Override
        double getRateOfInterest() {
            return 0.2d;
        }
    }

    class CorporateBank extends Bank {
        @Override
        double getRateOfInterest() {
            return 0.4d;
        }
    }

    public void main(String[] args) {
        Bank centralBank = new CentralBank();
        Bank corporateBank =  new CorporateBank();
        centralBank.getRateOfInterest(); //Invoked from overridden method of CentralBank class
        corporateBank.getRateOfInterest(); //Invoked from overridden method of CorporateBank class
    }



    class Car {
        String engineType;
        boolean isRunning;
        Car(String engineType){ this.engineType = engineType; }
        public void start(){ this.isRunning = true; }
        public void stop(){ this.isRunning = false; }

        public void main(String[] args) {
            Car audi = new Car("W8"); //Instantiation or creating an instance of a class
            audi.start(); //Invoking behaviour or method
        }
    }


//    <accessModifier> class <className> {
//        <accessModifier> <dataType> <fieldName>;
//
//        <accessModifer> <returnType> <methodName>(){
//            return <returnType>
//        }
//    }

    }
