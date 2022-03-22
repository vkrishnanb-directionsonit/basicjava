package com.aspire.project.facebook;

import java.util.Date;

enum Status_enum { 	ACTIVE, INACTIVE, CLOSED, PENDINGACTIVATION }

public class Account {
     public String emailaddress;
	 public String password;
	 public Date dateOfJoining;
	 public Status_enum accountStatus;
	 public Setting accountSettings;
	 public Image degitalProfileImage;
	 public String address;
}

enum Theme_enum { DARK, WHITE, CLASSIC, STANDARD }

class Setting
{
	public Theme_enum theme;
	public String securitySettings;
	public String privacySettings;	
}