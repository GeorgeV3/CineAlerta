package cb.CineAlert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long user_id;
	@Column(nullable=false, unique=true)
	private String user_name;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String first_name;
	@Column(nullable=false)
	private String last_name;
	@Column(nullable=false)
	private String email;
	@Column(columnDefinition="character varying (10) not null DEFAULT 'FFN'",length=10,nullable=false)	
	private String role;
	@Column(nullable = false, columnDefinition = "int default 0")// 0 = active , 1 = softDeleted
	private int status;
	
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}