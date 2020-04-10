package hiai.model;

public class StuType {
	private int id;//编号
	private  String  姓名;
	private  String  学号;
	private  String  联系号码;
	private  String  学院;
	private  String  是否接触患者;
	private  String  是否有疑似状况;
	private  String  当前居住地;
	private  String  其他备注;
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
	public String get学号() {
		return 学号;
	}
	public void set学号(String 学号) {
		this.学号 = 学号;
	}
	public String get联系号码() {
		return 联系号码;
	}
	public void set联系号码(String 联系号码) {
		this.联系号码 = 联系号码;
	}
	public String get学院() {
		return 学院;
	}
	public void set学院(String 学院) {
		this.学院 = 学院;
	}
	public String get是否接触患者() {
		return 是否接触患者;
	}
	public void set是否接触患者(String 是否接触患者) {
		this.是否接触患者 = 是否接触患者;
	}
	public String get是否有疑似状况() {
		return 是否有疑似状况;
	}
	public void set是否有疑似状况(String 是否有疑似状况) {
		this.是否有疑似状况 = 是否有疑似状况;
	}
	public String get当前居住地() {
		return 当前居住地;
	}
	public void set当前居住地(String 当前居住地) {
		this.当前居住地 = 当前居住地;
	}
	public String get其他备注() {
		return 其他备注;
	}
	public void set其他备注(String 其他备注) {
		this.其他备注 = 其他备注;
	}
	/**
	 * 
	 */
	public StuType() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param 姓名
	 * @param 学号
	 * @param 联系号码
	 * @param 学院
	 * @param 是否接触患者
	 * @param 是否有疑似状况
	 * @param 当前居住地
	 * @param 其他备注
	 */
	public StuType(String 姓名, String 学号, String 联系号码, String 学院, String 是否接触患者, String 是否有疑似状况, String 当前居住地,
			String 其他备注) {
		super();
		this.姓名 = 姓名;
		this.学号 = 学号;
		this.联系号码 = 联系号码;
		this.学院 = 学院;
		this.是否接触患者 = 是否接触患者;
		this.是否有疑似状况 = 是否有疑似状况;
		this.当前居住地 = 当前居住地;
		this.其他备注 = 其他备注;
	}
	
}
