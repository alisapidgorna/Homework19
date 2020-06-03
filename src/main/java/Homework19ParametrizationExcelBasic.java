import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework19ParametrizationExcelBasic {

    public static ExcelReader excel = null;

    @Test(dataProvider="getData")
    public void testData(String username, String password, String position){
        System.out.println(username+"---"+password+"---"+position);
    }
    @DataProvider
    public static Object[][] getData(){
        if(excel == null){
            excel = new ExcelReader("c:\\selenium\\testngdatahomework.xlsx");
        }

        String sheetName = "loginTestHomework";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);
        Object[][] data = new Object[rows-1][cols];
        //наполняем наш data данными из экселя
        for(int rowNum=2; rowNum<=rows; rowNum++){
            for(int colNum=0; colNum<cols; colNum++){
                //rowNum-2 дает 0 и это для того чтобы начать наполнять с data[0][0] строк и столбцов
                data[rowNum-2][colNum] = excel.getCellData(sheetName,colNum,rowNum);
            }
        }
        return data;
    }
}
