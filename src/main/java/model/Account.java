package model;

/**
 * @author 455983
 * account情報を扱うクラス
 */
public class Account {
    
	//userid
	private String userId;
	//password
	private String pass;
	//mailaddress
	private String mail;
	//名前
	private String name;
	//年齢
	private int age;
	
	public Account(String userId, String pass, String mail,
			String name, int age) {
		this.userId = userId;
		this.pass = pass;
		this.mail = mail;
		this.name = name;
		this.age = age;
	}

	//useridを取得する
	public String getUserId() {
		return userId;
	}

	//passwordを取得する
	public String getPass() {
		return pass;
	}

	//mailadressを取得する
	public String getMail() {
		return mail;
	}

	//名前を取得する
	public String getName() {
		return name;
	}

	//年齢を取得する
	public int getAge() {
		return age;
	}
	
	
}
