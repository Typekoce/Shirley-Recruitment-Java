public class App {

  public static void main(String[]  args){

    AppRoutes cont = new AppRoutes();

    cont.data.setData("foo","bar");

    cont.run("home");

  }
}
