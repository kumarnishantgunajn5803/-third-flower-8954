package Model;

public class BDO {
	 private int BdoId;
     private String name;
     private String username;
     private String password;
	public BDO() {
		 
		// TODO Auto-generated constructor stub
	}
	public BDO(int bdoId, String name, String username, String password) {
		super();
		BdoId = bdoId;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public int getBdoId() {
		return BdoId;
	}
	public void setBdoId(int bdoId) {
		BdoId = bdoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "BDO [BdoId=" + BdoId + ", name=" + name + ", username=" + username + ", password=" + password + "]";
	}
     
      
}



