package hiai.model;
/*
 * 教师实体
 */
public class Teacher {
	private int id;//编号
	private String  姓名;
	private String 工号;
	private String  联系方式;
	private String  所在学院;
	private String  是否接触过患者;
	private String  是否有疑似状况;
	private String  目前居住地址;
	private String  今日填报时间;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String get姓名() {
		return 姓名;
	}
	public void set姓名(String 姓名) {
		this.姓名 = 姓名;
	}
	public String get工号() {
		return 工号;
	}
	public void set工号(String 工号) {
		this.工号 = 工号;
	}
	public String get联系方式() {
		return 联系方式;
	}
	public void set联系方式(String 联系方式) {
		this.联系方式 = 联系方式;
	}
	public String get所在学院() {
		return 所在学院;
	}
	public void set所在学院(String 所在学院) {
		this.所在学院 = 所在学院;
	}
	public String get是否接触患者() {
		return 是否接触过患者;
	}
	public void set是否接触患者(String 是否接触患者) {
		this.是否接触过患者 = 是否接触患者;
	}
	public String get是否有疑似状况() {
		return 是否有疑似状况;
	}
	public void set是否有疑似状况(String 是否有疑似状况) {
		this.是否有疑似状况 = 是否有疑似状况;
	}
	public String get目前居住地址() {
		return 目前居住地址;
	}
	public void set目前居住地址(String 目前居住地址) {
		this.目前居住地址 = 目前居住地址;
	}
	public String get今日填报时间() {
		return 今日填报时间;
	}
	public void set今日填报时间(String 今日填报时间) {
		this.今日填报时间 = 今日填报时间;
	}
	/**
	 * 
	 */
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param 姓名
	 * @param 工号
	 * @param 联系方式
	 * @param 所在学院
	 * @param 是否接触患者
	 * @param 是否有疑似状况
	 * @param 目前居住地址
	 * @param 今日填报时间
	 */
	public Teacher(String 姓名, String 工号, String 联系方式, String 所在学院, String 是否接触过患者, String 是否有疑似状况, String 目前居住地址,
			String 今日填报时间) {
		super();
		this.姓名 = 姓名;
		this.工号 = 工号;
		this.联系方式 = 联系方式;
		this.所在学院 = 所在学院;
		this.是否接触过患者 = 是否接触过患者;
		this.是否有疑似状况 = 是否有疑似状况;
		this.目前居住地址 = 目前居住地址;
		this.今日填报时间 = 今日填报时间;
	}
	
}