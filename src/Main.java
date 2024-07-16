

public class Main {

  public static void main(String[] args) {

    try {
      loginPassword.inputCheck("Smitt", "qwertн", "qwerty");
    } catch (WrongLoginException | WrongPasswordException e) {
      throw new RuntimeException(e);
    } finally {
      System.out.println("Код завершён");
    }
  }


}


