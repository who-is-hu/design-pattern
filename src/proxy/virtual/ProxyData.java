package proxy.virtual;

public class ProxyData implements BigData{
    private String someInfo;

    public ProxyData(String someInfo) {
        this.someInfo = someInfo;
    }

    @Override
    public void showInfo() {
        System.out.println(someInfo);
    }

    public BigDataImpl getBigData(){
        return new BigDataImpl(someInfo);
    }
}
