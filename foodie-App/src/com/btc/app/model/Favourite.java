package com.btc.app.model;

import com.btc.app.ui.FavouriteAppUI;

public class Favourite {
	private int favId;
	private int userId;
	private String restoName;
	 
	public Favourite()
	{
		
	}
	public Favourite(int favId, int userId, String restoName) {
		super();
		this.favId = favId;
		this.userId = userId;
		this.restoName = restoName;
	}
	public int getFavId() {
		return favId;
	}
	public void setFavId(int favId) {
		this.favId = favId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getRestoName() {
		return restoName;
	}
	public void setRestoName(String restoName) {
		this.restoName = restoName;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + favId;
		result = prime * result + ((restoName == null) ? 0 : restoName.hashCode());
		result = prime * result + userId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Favourite other = (Favourite) obj;
		if (favId != other.favId)
			return false;
		if (restoName == null) {
			if (other.restoName != null)
				return false;
		} else if (!restoName.equals(other.restoName))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "FavouriteAppUI [favId=" + favId + ", userId=" + userId + ", restoName=" + restoName + "]";
	}
}
