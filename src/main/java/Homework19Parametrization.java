import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework19Parametrization {

    @Test(dataProvider = "getData")
    public void doLogin(String username, String password){
        System.out.println(username + "-----" + password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[6][2];

        data[0][0] = "alinaqa@test.com.ua";
        data[0][1] = "alqapass1";

        data[1][0]= "marinapm@test.com.ua";
        data[1][1] = "mapmpass2";

        data[2][0]= "maximdev@test.com.ua";
        data[2][1] = "madevpass3";

        data[3][0] = "alladev@test.com.ua";
        data[3][1] = "aldevpass4";

        data[4][0]= "ostapqa@test.com.ua";
        data[4][1] = "osqapass5";

        data[5][0]= "oleksiydevops@test.com.ua";
        data[5][1] = "oldevopspass6";

        return data;
    }
}