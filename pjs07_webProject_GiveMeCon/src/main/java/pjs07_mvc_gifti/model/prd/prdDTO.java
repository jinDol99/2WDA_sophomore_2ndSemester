package pjs07_mvc_gifti.model.prd;

public class prdDTO {

	private int p_code;
	private String p_name;
	private String p_category;
	private String p_img;
	private String p_barcode;
	private String p_limDate;	// 만약 sql 오류난다면 date 형식 가져올 때 String형이 맞는지 확인해보자
	private int p_orgnPrice;
	private int p_salePrice;
	private String p_discription;

	public prdDTO() {
		super();
	}
	
	public prdDTO(int p_code, String p_name, String p_category, String p_img, String p_barcode, 
				String p_limDate, int p_orgnPrice, int p_salePrice, String p_discription) {
		
		super();
		
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_category = p_category;
		this.p_img = p_img;
		this.p_barcode = p_barcode;
		this.p_limDate = p_limDate;
		this.p_orgnPrice = p_orgnPrice;
		this.p_salePrice = p_salePrice;
		this.p_discription = p_discription;
	}

	public int getP_code() {
		return p_code;
	}

	public void setP_code(int p_code) {
		this.p_code = p_code;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_category() {
		return p_category;
	}

	public void setP_category(String p_category) {
		this.p_category = p_category;
	}

	public String getP_img() {
		return p_img;
	}

	public void setP_img(String p_img) {
		this.p_img = p_img;
	}

	public String getP_barcode() {
		return p_barcode;
	}

	public void setP_barcode(String p_barcode) {
		this.p_barcode = p_barcode;
	}

	public String getP_limDate() {
		return p_limDate;
	}

	public void setP_limDate(String p_limDate) {
		this.p_limDate = p_limDate;
	}

	public int getP_orgnPrice() {
		return p_orgnPrice;
	}

	public void setP_orgnPrice(int p_orgnPrice) {
		this.p_orgnPrice = p_orgnPrice;
	}

	public int getP_salePrice() {
		return p_salePrice;
	}

	public void setP_salePrice(int p_salePrice) {
		this.p_salePrice = p_salePrice;
	}

	public String getP_discription() {
		return p_discription;
	}

	public void setP_discription(String p_discription) {
		this.p_discription = p_discription;
	}
}
