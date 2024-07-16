import java.util.regex.Pattern;

public class loginPassword {

  private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9_-]{0,20}$");


  public static void inputCheck(String login, String password, String confirmPassword) {
    if (!PATTERN.matcher(login).matches()) {
      System.out.println("Неправильный логин");
      throw new WrongLoginException();

    }
    if (!PATTERN.matcher(password).matches() || !password.equals(confirmPassword)) {
      System.out.println("Неправильный пароль");
      throw new WrongPasswordException();
    }
  }

}
