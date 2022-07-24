public class AppData {

  private int total = 100;

  private int counter = 0;

  public AppPrint print = new AppPrint();

  public AppDatas data = new AppDatas();

  public AppDatas[] datas = new AppDatas[total];

  public String[] arr = new String[11];

  public int AppPropertiesTotal = 4;

  AppData(){

  }

  public void setData(String k, String v){

    datas[counter] = new AppDatas();

    datas[counter].key = k;

    datas[counter].val = v;

    counter++;

  }

  public void setDataProperties(String k, String v,AppProperties[] props){

    datas[counter] = new AppDatas();

    datas[counter].key = k;

    datas[counter].val = v;

    datas[counter].props = props;

    counter++;

  }

  public void setDataArray(String k, String v, String[] arr){

    datas[counter] = new AppDatas();

    datas[counter].key = v;

    datas[counter].val = k;

    datas[counter].arr = arr;

    counter++;

  }

  public String getData(String k){

      String result = "FALSE";

      for(int i = 0; i<counter; i++){

          if(datas[i].key == k){

            return datas[i].val;

          }

      }

      return result;

  }


  public String[] readDataArray(String k){

      String[] result = new String[total];

      for(int i = 0; i<counter; i++){

          if(datas[i].key != null && datas[i].key == k){

            return datas[i].arr;

          }

      }

      return result;

  }

  public void getDataArray(String k, String v){

     int j = 0;

      for(int i = 0; i<counter; i++){

          if(datas[i].key != null && datas[i].key == k){

            arr[j] = datas[i].val;

            j++;

          }

      }

      setDataArray(k,v,arr);
  }

  public String matchDataProperties(int i,String v){

    String result = "FALSE";

    for(int j = 0; j<this.AppPropertiesTotal; j++){

      if(v == datas[i].props[j].key){

        return datas[i].props[j].val;

      }

    }

    return result;
  }

  public int matchDataPropertiesNumber(int i,String v){

    int result = 0;

    for(int j = 0; j<this.AppPropertiesTotal; j++){

      if(v == datas[i].props[j].key){

        return datas[i].props[j].number;

      }

    }

    return result;
  }

  public String getDataProperties(String k, String v){

      String result = "FALSE";

      for(int i = 0; i<counter; i++){

          if(datas[i].val != null && datas[i].val == k){

            return matchDataProperties(i,v);

          }

      }

      return result;

  }

  public int getDataPropertiesNumber(String k, String v){

      int result = 0;

      for(int i = 0; i<counter; i++){

          if(datas[i].val != null && datas[i].val == k){

            return matchDataPropertiesNumber(i,v);

          }

      }

      return result;

  }

}
