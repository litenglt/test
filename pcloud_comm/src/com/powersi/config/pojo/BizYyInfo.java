package com.powersi.config.pojo;


import com.powersi.comm.bean.BaseBean;
/**
 * 医院信息实体对象，请保持与hygeia_web的对象一致
 * @author 黄尧
 *
 */
public class BizYyInfo extends BaseBean{
	private static final long serialVersionUID = 1L;
	private long id;
	private String yybm;// '医院编码'
	private String yymc;//'医院名称'
	private String match_yybm;// '匹配的医院编码 '
	private String match_yymc;//'匹配的医院名称 '
	private String assist_uuid;//'对应dbservice服务器uuid'
	private String server_ip;//服务器ip地址
	private String lb;//'类别  1医院  2药店  对应字典'
	private String lb_name;//类别的中文标示
	private String tcqbm;//'统筹区编码，对应字典'
	private String tcqbm_name;//统筹区对应编码的名称
	private String center_serve_id = "0000-00";//'中心服务标识，对应字典，中心编码_险种',
	private String yyjb;//'医院级别 0其他  1 一级  2二级   3三级'
	private String yyjb_name;//医院级别名称
	private String yydj;//'医院等级  甲、乙、丙 对应字典'
	private String yydj_name;//'医院等级的中文标示
	private String lxr;//'联系人'
	private String lxdh;//'联系电话'
	private String lxdz;//'联系地址'
	private String bzsm;//'备注说明'
	private String valid_flag;//'有效标志  0停用     1正常'
	private String password;//密码,录入的为准，否则随机生成一个8位字符串
	private int capacity_need;//需要服务器提供的能力系数
	
	private String yy_type;//医疗机构的所属类型，有通用接口医院，药店，普通医院等,配置为字典
	private String yy_type_name;//医疗机构的所属类型中文翻译，有通用接口医院，药店，普通医院等,配置为字典
	private String yyml_type;//医院目录所属类型 1单独目录     2公共目录，青海未使用，岳阳开启
	private String yyml_type_name;//医院目录所属类型，中文翻译
	private String ywjb_type;//业务经办类型
	public String getMatch_yybm() {
		return match_yybm;
	}
	public void setMatch_yybm(String match_yybm) {
		this.match_yybm = match_yybm;
	}
	public String getMatch_yymc() {
		return match_yymc;
	}
	public void setMatch_yymc(String match_yymc) {
		this.match_yymc = match_yymc;
	}
	public String getCenter_serve_id() {
		return center_serve_id;
	}
	public void setCenter_serve_id(String center_serve_id) {
		this.center_serve_id = center_serve_id;
	}
	public String getServer_ip() {
		return server_ip;
	}
	public void setServer_ip(String server_ip) {
		this.server_ip = server_ip;
	}
	public String getLb_name() {
		return lb_name;
	}
	public void setLb_name(String lb_name) {
		this.lb_name = lb_name;
	}
	public String getTcqbm_name() {
		return tcqbm_name;
	}
	public void setTcqbm_name(String tcqbm_name) {
		this.tcqbm_name = tcqbm_name;
	}
	public String getYyjb_name() {
		return yyjb_name;
	}
	public void setYyjb_name(String yyjb_name) {
		this.yyjb_name = yyjb_name;
	}
	public String getYydj_name() {
		return yydj_name;
	}
	public void setYydj_name(String yydj_name) {
		this.yydj_name = yydj_name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getYybm() {
		return yybm;
	}
	public void setYybm(String yybm) {
		this.yybm = yybm;
	}
	public String getYymc() {
		return yymc;
	}
	public void setYymc(String yymc) {
		this.yymc = yymc;
	}
	public String getAssist_uuid() {
		return assist_uuid;
	}
	public void setAssist_uuid(String assist_uuid) {
		this.assist_uuid = assist_uuid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getLb() {
		return lb;
	}
	public void setLb(String lb) {
		this.lb = lb;
	}
	public String getTcqbm() {
		return tcqbm;
	}
	public void setTcqbm(String tcqbm) {
		this.tcqbm = tcqbm;
	}
	public String getYyjb() {
		return yyjb;
	}
	public void setYyjb(String yyjb) {
		this.yyjb = yyjb;
	}
	public String getYydj() {
		return yydj;
	}
	public void setYydj(String yydj) {
		this.yydj = yydj;
	}
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getLxdz() {
		return lxdz;
	}
	public void setLxdz(String lxdz) {
		this.lxdz = lxdz;
	}
	public String getBzsm() {
		return bzsm;
	}
	public void setBzsm(String bzsm) {
		this.bzsm = bzsm;
	}
	public String getValid_flag() {
		return valid_flag;
	}
	public void setValid_flag(String valid_flag) {
		this.valid_flag = valid_flag;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCapacity_need() {
		return capacity_need;
	}
	public void setCapacity_need(int capacity_need) {
		this.capacity_need = capacity_need;
	}
	public String getYy_type() {
		return yy_type;
	}
	public void setYy_type(String yy_type) {
		this.yy_type = yy_type;
	}
	public String getYyml_type() {
		return yyml_type;
	}
	public void setYyml_type(String yyml_type) {
		this.yyml_type = yyml_type;
	}
	public String getYy_type_name() {
		return yy_type_name;
	}
	public void setYy_type_name(String yy_type_name) {
		this.yy_type_name = yy_type_name;
	}
	public String getYyml_type_name() {
		return yyml_type_name;
	}
	public void setYyml_type_name(String yyml_type_name) {
		this.yyml_type_name = yyml_type_name;
	}
	public String getYwjb_type() {
		return ywjb_type;
	}
	public void setYwjb_type(String ywjb_type) {
		this.ywjb_type = ywjb_type;
	}
	
}
