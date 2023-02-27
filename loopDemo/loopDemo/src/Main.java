public class Main {
    public static void main(String[] args) {
        //for
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("For Döngüsü bitti.");

        int i= 2;
        //while
        while(i<10){
            System.out.println(i);
            i+= 2;
        }
        System.out.println("While döngüsü bitti.");

        //do-while döngüsü
        int j = 1;
        do{
            System.out.println(j);
            j+= 2;
        }while (j<10);
        System.out.println("d0-while döngüsü bitti.");



    }
}