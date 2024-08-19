// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        Users user1 =  new Users("Исаев","Эржан", "Азаматович", "564656546468","20203200250307");
        String [] userValidation = {user1.getSurname(),user1.getName(),user1.getPatronymic(), user1.getPassword(), user1.getPin()};

        try {
            System.out.println(user1.validationUsers(userValidation));
        }catch (IllegalArgumentException a){
            System.out.println("введенные данные не прошли проверку");
        }
    }
}