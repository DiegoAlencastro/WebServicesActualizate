package tec.utpl.actualizate.actualizateservice.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    private String iduser;
    private String email;
    private String cellphone;
    private String phone;
    private String dirprov;
    private String dirci;
    private String dircp;
    private String dircs;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getIduser() {
		return iduser;
	}
	public void setIduser(String iduser) {
		this.iduser = iduser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDirprov() {
		return dirprov;
	}
	public void setDirprov(String dirprov) {
		this.dirprov = dirprov;
	}
	public String getDirci() {
		return dirci;
	}
	public void setDirci(String dirci) {
		this.dirci = dirci;
	}
	public String getDircp() {
		return dircp;
	}
	public void setDircp(String dircp) {
		this.dircp = dircp;
	}
	public String getDircs() {
		return dircs;
	}
	public void setDircs(String dircs) {
		this.dircs = dircs;
	}
    
    
    
}
