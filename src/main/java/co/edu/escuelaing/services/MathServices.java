package co.edu.escuelaing.services;

public class MathServices {

  public static Integer getSquare(Integer i){
    return i*i;
  }

  public static String getUser(User u){
    return u.getName() + " - " + u.getEmail();
  }

  public static User postUser(User u){
    return u;
  }

}
