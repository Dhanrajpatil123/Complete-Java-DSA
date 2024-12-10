
# Second --> Traversing
// ---------------------------------


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array : ");
    
    int[] array = new int[sc.nextInt()];

    for (int index = 0; index < array.length; index++) {
        System.out.print("Enter element : ");
        array[index] = sc.nextInt();
    }

    for (int x : array){
        System.out.print(x + " ");
    }
}
