package utills;

public class excelutilsdemo {
	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");
		Excellutills excel = new  Excellutills(projectpath+"\\excell\\data.xlsx", "sheet1");
		excel.getrowcount();
		excel.getcelldatastring(0, 0);
		excel.getcelldatanumber(1, 1);
		
	}

}
