package com.zsh.demo01;

public class Proxy {

    private Host host;
    public  Proxy(){

    }
    public  Proxy(Host host){
        this.host=host;
    }
public  void  rent(){   //中介能帮房东做很多事情
        host.rent();
        seeHouse();
        hetong();
        fare();
}
//看房
    public void  seeHouse(){
        System.out.println("中介看你看房");
    }
    //签合同
    public void  hetong(){
        System.out.println("签租赁合同");
    }
    //收中介费
    public void  fare(){
        System.out.println("收中介费");
    }
}
