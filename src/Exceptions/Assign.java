//package Exceptions;
//
//import java.io.IOException;
//import java.nio.file.*;
//import java.util.Scanner;
//
//public class Assign {
//    void createFileMethod(String fileName) throws FileAlreadyExistsException, ArithmeticException {
//        if (fileName.isEmpty()) {
//            System.out.println("File name cannot be empty");
//        } else {
//            Path filePath = Paths.get(fileName);
//            try {
//                Files.createFile(filePath);
//                System.out.println(fileName+ " has be created");
//            } catch (FileAlreadyExistsException e) {
//                System.out.println(fileName + " already exist");
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//    void insertFile(String f, String message){
//        if (f.isEmpty() || message.isEmpty()){
//            System.out.println("Empty strings can not be accepted");
//        } else {
//            Path filePath = Paths.get("C:\\Users\\hp\\IdeaProjects\\JavaL\\src\\Exceptions", f);
//            try {
//                Files.write(filePath, message.getBytes(), StandardOpenOption.APPEND);
//                System.out.println("message inserted to the file "+ f);
//            }catch (NoSuchFileException e) {
//                System.out.println(f +" does not exist, try again with different file name");
//            }
//            catch (IOException e ){
//                throw new RuntimeException(e);
//            }
//        }
//    }
//    void readFile(String fileNameRead){
//        if (fileNameRead.isEmpty()){
//            System.out.println("File name cannot be empty");
//        } else {
//            Path filePath = Paths.get("C:\\Users\\hp\\IdeaProjects\\JavaL\\src\\Exceptions", fileNameRead);
//            try {
//                String read = Files.readString(filePath);
//                System.out.println(read);
//            } catch (NoSuchFileException e) {
//                System.out.println(fileNameRead + " does not exist");
//            } catch (IOException e){
//                throw new RuntimeException(e);
//            }
//        }
//    }
//    String test(String a, Scanner input){
//        input.nextLine();
//        System.out.println("Enter file name to be " + a );
//        return input.nextLine();
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        Assign assign = new Assign();
////        boolean run = true;
//        while (true) {
//            System.out.println("Choose option from below (enter option number) \n 1. Create \n 2. Insert \n 3. Read ");
//            int optionNumber = 0 ;
//
//            optionNumber = input.nextInt();
//            if (optionNumber < 1 || optionNumber > 3) {
//                  System.out.println("Option number should be 1, 2, or 3");
//            }
//            else  {
//                switch (optionNumber) {
//                case 1:
////                    input.nextLine();
////                    System.out.println("Enter File name to be created");
////                    assign.test("created", input);
////                    String fileName = input.nextLine();
//                    assign.createFileMethod(assign.test("created", input));
//                    break;
//                case 2:
////                    input.nextLine();
////                    System.out.println("Enter file name to insert");
//                    assign.test("insert", input);
////                    String f = input.nextLine();
//                    System.out.println("Enter the message ");
//                    String message = input.nextLine();
//                    assign.insertFile(assign.test("created", input), message);
//                    break;
//                case 3:
////                    input.nextLine();
////                    System.out.println("Enter File name to read");
////
//                    assign.test("read", input);
////                    String fileNameRead = input.nextLine();
//                    assign.readFile(assign.test("created", input));
//                    break;
//            }
//            }
//            System.out.println("Do you want to continue? or try again? (yes/no)");
//            String continueOption = input.next().toLowerCase();
//            if (!continueOption.equals("yes")) {
////                run = false;
//                break;
//            }
//        }
//        input.close();
//    }
//}
