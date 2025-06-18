package chapter2;

public class SwitchStatement {
    public static void main(String[] args) {
        int department = 1;
        String supervisor;

//        if (department == 1 || department == 2){
//            supervisor = "John";
//        } else if (department == 3) {
//            supervisor = "Jessica";
//        } else if (department == 4) {
//            supervisor = "Tom";
//        }else{
//            supervisor = "Smith";
//        }

        switch (department){
            case 1:
            case 2:
                supervisor = "John";
            break;
            case 3: supervisor = "Jessica";
            break;
            case 4: supervisor = "Tom";
            break;
            default: supervisor = "Smith";
        }

        System.out.println("Supervisor for department " + department + " is " + supervisor);

    }
}
