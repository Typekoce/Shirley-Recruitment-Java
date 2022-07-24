public class MenuModel extends AppModel {

  MenuModel(AppData data){

    this.print.display(data.getData("page"));

    this.data = data;

    if(data.getData("page") == "customers"){

      setMenuCustomers();

    } else {

      setMenu();

    }

  }

  public AppProperties[] createProps() {

    // Add number elements to matchDataProperties in AppData.java

    AppProperties[] props = new AppProperties[data.AppPropertiesTotal];

    props[0] = new AppProperties();

    props[1] = new AppProperties();

    props[2] = new AppProperties();

    props[3] = new AppProperties();

    props[0].set("icon","images/home/ipad_button_default.jpg");

    props[1].set("rollover","images/home/default_rollover.jpg");

    props[2].setNumber("imgWidth",232);

    props[3].setNumber("imgHeight",70);

    return props;
  }

  public String active(String txt){

    return "\uE313 " + txt;

  }


  public void setMenuCustomers(){

    data.setDataProperties("left","Home",createProps());

    data.setDataProperties("left",active("Customers"),createProps());

    data.setDataProperties("left","My Account",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

  }



  public void setMenu(){

    data.setDataProperties("left",active("Home"),createProps());

    data.setDataProperties("left","Nike",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

    data.setDataProperties("left","",createProps());

  }

}
