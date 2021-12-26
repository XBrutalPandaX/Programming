import java.util.Scanner;
public class method_ex {
    public static void main(String[] args) {
        System.out.print("Binary/Octal: ");
        Scanner inp = new Scanner(System.in);
        String type = inp.next();


        System.out.print("Input Number: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch(type){
        case "binary":
            binary(input);
            break;
        case "octal":
            octal(input);
            break;
        
    }
}

    public static void binary(int input){
        int[] result;
        result = new int[100];
        int count=0;
        double size=(input/255)*8;
        System.out.println(size);
      
        while(input>0){
                if( input%2 ==0){
                    result[count]=0;
                    
                }
                else{
                    result[count]=1;
                }
                input= input/2;
                count++;
                
        }
        System.out.println("Size in Bits: "+count);
        System.out.print("Binary: ");
        for(int j=count;j>0;j--){
            if(j%4==0){
                System.out.print(" ");
            }
            System.out.print(result[j]);
        }
    }
    public static void octal(int input){
        int result[];
        int q=0;
        int count=0;
        result = new int[100];
        while(input>0){
               q =input% 8;
               result[count]=q;
               input=input/8;
               count++;
            
        }
        System.out.println("Size in Bits: "+count);
        System.out.print("Octal: ");
        for(int j=count-1;j>=0;j--){
            if(j%4==0){
                System.out.print(" ");
            }
            System.out.print(result[j]);
        }

    }
}
