package test;

import dao.AccountDAO;
import model.Account;
import model.Login;

public class AccountDAOTest {

	public static void main(String[] args) {
		testFindByLogin1(); //ユーザーが見つかる場合のテスト
		testFindByLogin2(); //ユーザーが見つからない場合のテスト

	}
	
	public static void testFindByLogin1() {
		Login login = new Login("minato", "1234");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);
		
		if (result != null && 
				result.getUserId().equals("minato") &&
				result.getPass().equals("1234") &&
				result.getMail().equals("minato@sukkiri.com") &&
				result.getName().equals("湊 雄輔") && result.getAge() == 23) {
			System.out.println("testFindByLogic1:成功しました");
		}else {
			System.out.println("testFindByLogic1:失敗しました");
		}
	}
	
	public static void testFindByLogin2() {
		Login login = new Login("minato", "12345");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findByLogin(login);
		
		if (result == null) {
			System.out.println("testFindByLogic2:成功しました");
		}else {
			System.out.println("testFindByLogic2:失敗しました");
		}
	}

}
