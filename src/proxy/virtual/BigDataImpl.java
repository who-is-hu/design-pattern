package proxy.virtual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigDataImpl implements BigData{

    private String someInfo;
    private List<String> data;

    public BigDataImpl(String someInfo) {
        this.someInfo = someInfo;
    }

    @Override
    public void showInfo() {
        //DB에서 많은 양의 데이터를 불러와 출력한다 가정
        data = new ArrayList<String>(Arrays.asList("data1","data2"));
        for (String record : data) {
            System.out.println("record = " + record);
        }
    }
}
