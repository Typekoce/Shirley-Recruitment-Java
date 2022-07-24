public class HomeModel extends AppModel{

  HomeModel(AppData data){

    data.setData("page","home");

    MenuModel menu = new MenuModel(data);

    this.data = data;

    data.getDataArray("left","sidebar");

    data.readDataArray("sidebar");

    data.setData("product-image","images/home/ipad_panel_beats.jpg");

    data.setData("title","E-Shop");

  }


}
