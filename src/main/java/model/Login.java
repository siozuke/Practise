package model;

/**
 * @author 455983
 * login情報を表すクラス
 */
public class Login {
    
	//userid  
	private String userId;
	//password
	private String pass;
	
	public Login(String userId, String pass) {
		this.userId = userId;
		this.pass = pass;
	}
    
	//useridを取得する
	public String getUserId() {
		return userId;
	}
	
    //passwordを取得する
	public String getPass() {
		return pass;
	}
	
	
}
