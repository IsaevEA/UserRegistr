import java.util.Objects;

public class Users {
    private String surname;
    private String name;
    private String patronymic;
    private String password;
    private String pin;

    public Users() {
    }

    public Users(String surname, String name, String patronymic, String password, String pin) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.password = password;
        this.pin = pin;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }



    public boolean validationUsers(String [] parameter){
        for (String s : parameter) {
            if (Objects.equals(s, getPassword())) {
                int a = s.toCharArray().length;
                if (a < 8) {
                    throw new IllegalArgumentException();
                }
            } else {
                if (s.contains(" ")) {
                    throw new IllegalArgumentException();
                }
            }
        }
        return true;
    }

}