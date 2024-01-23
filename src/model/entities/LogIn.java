package model.entities;

import java.util.Date;
import java.util.Objects;

public class LogIn{
	private String userName; 
	private Date time;
	
	public LogIn(String userName, Date time) {
		this.userName = userName;
		this.time = time;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogIn other = (LogIn) obj;
		return Objects.equals(userName, other.userName);
	} 
	
	
		
}
