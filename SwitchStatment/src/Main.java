public class Main {
    public static void main(String[] args) {
    char switchValue='g';

    switch (switchValue){
        case 'A': case 'B': case 'D': case 'C': case 'E': case 'F':
            System.out.println(switchValue+ " is Found in case : "+switchValue );
            break;
        default:
            System.out.println(switchValue+" Not Found.");
    }

    }
}