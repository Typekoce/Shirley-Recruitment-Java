public class AppRoutes {

  public AppPrint print = new AppPrint();

  public AppData data = new AppData();

  public void run (String route){

    print.display(data.getData("foo"));

    if(route == "home"){

        HomeController home = new HomeController();

    } else {

        ProductController product = new ProductController();

    }

  }

}
