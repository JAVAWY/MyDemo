package hiai.model;


/**
 * 用户的实体，用户名和密码
 * @author www.hiai.top 开发者：黄康权
 *
 */
public class User {
	private int id;//编号
	private String userName;//用户名
	private String passWord;//密码
	private int is_admin;//是否为管理员
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public int getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(int is_admin) {
		this.is_admin = is_admin;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	
	
	
}
