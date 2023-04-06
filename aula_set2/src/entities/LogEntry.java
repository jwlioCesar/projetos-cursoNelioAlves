package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
	
	private String username;
	private Date instant;
	
	public LogEntry(String username, Date instant) {
		
		this.username = username;
		this.instant = instant;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getInstant() {
		return instant;
	}

	public void setInstant(Date instant) {
		this.instant = instant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}
	

}
