package pjs07_mvc_gifti.model.member;

public class memDTO {
	private int m_code;
	private String m_name;
	private String m_id;
	private String m_password;
	private String m_RRN;
	private String m_contact;
	private String m_email;
	private int m_permission;
	private String m_regDate;
	
	public memDTO() {
		super();
	}

	public memDTO(int m_code, String m_name, String m_id, String m_password, String m_RRN, String m_contact,
			String m_email, int m_permission, String m_regDate) {
		super();
		this.m_code = m_code;
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_RRN = m_RRN;
		this.m_contact = m_contact;
		this.m_email = m_email;
		this.m_permission = m_permission;
		this.m_regDate = m_regDate;
	}

	public int getM_code() {
		return m_code;
	}

	public void setM_code(int m_code) {
		this.m_code = m_code;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_RRN() {
		return m_RRN;
	}

	public void setM_RRN(String m_RRN) {
		this.m_RRN = m_RRN;
	}

	public String getM_contact() {
		return m_contact;
	}

	public void setM_contact(String m_contact) {
		this.m_contact = m_contact;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public int getM_permission() {
		return m_permission;
	}

	public void setM_permission(int m_permission) {
		this.m_permission = m_permission;
	}

	public String getM_regDate() {
		return m_regDate;
	}

	public void setM_regDate(String m_regDate) {
		this.m_regDate = m_regDate;
	}
	
	
	
}
