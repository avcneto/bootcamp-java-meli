package module3.aula_2_pratica_integrada_1_exercice_1;


import com.sun.jdi.request.InvalidRequestStateException;

public class Password {
    private String password;
    private String regex;

    public Password(String regex) {
        this.regex = regex;
    }

    public void setValue(String password) {
        boolean passwordIsValid = password.matches(regex);
        if (passwordIsValid) {
            this.password = password;
        } else {
            throw new InvalidRequestStateException("Invalid password!!!");
        }
    }
}
