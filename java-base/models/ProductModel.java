public class ProductModel extends AppModel{

  ProductModel(AppData data){

    data.setData("page","customers");

    MenuModel menu = new MenuModel(data);

    this.data = data;

    data.getDataArray("left","sidebar");

    data.readDataArray("sidebar");

    data.setData("product-image","images/home/ipad_panel_hyperadapt.jpg");

    data.setData("title","E-Shop");

  }


}
