
//  Second --> Traversing
// ---------------------------------
class A{
  
    public static void printArray(int[] array){

        for (int x = 0; x < array.length; x++){
            System.out.print(array[x]);

            if (array.length-1 != x){
                System.out.print(", ");
            }
        }
    }
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array : ");
    
    int[] array = new int[sc.nextInt()];

    for (int index = 0; index < array.length; index++) {
        System.out.print("Enter element : ");
        array[index] = sc.nextInt();
    }

    printArray(array);
}
