package com.aspire.project.facebook;

import java.util.Date;
import java.util.List;

class FacebookBasePage
{
	public final Image fbLogo;
	public final String fontName;
	public final String cssStyleForPage;
	public final String pageHeader;
	public String pageBody;
	public final String pageFooter;
	
	public FacebookBasePage()
	{
		fbLogo=new Image();
		fontName="TimesNewRoman";
		cssStyleForPage = "Bootstrap";
		pageHeader = "FBHeader.html";
		pageFooter = "FBFooter.html";
	}
}

public class FacebookUserPage extends FacebookBasePage  {
	public Account userAccount;
	public HomePage userHome;
	public ProfilePage userProfile;	
}
enum Reaction_enum
{
	HEART, WOW, LIKE, UNLIKE
}
class HomePage extends FacebookBasePage 
{
	public List<Feed> userFeeds;
	public List<Notification> userNotifications;
	public List<Request> friendRequests;
	public List<Account> friends;
	public List<Account> followers;
	public List<Account> following;
	public List<Account> blockedAccounts;
	public List<Account> unfriendedAccounts;
	public List<Group> accountGroups;
	public List<Video> myStories;
	public List<Video> myFollowersStories;
	public List<Post> myPosts;
	public List<Post> likedPosts; // thumbs UP
	public List<Post> unlikedPosts; // thumbs down
	public List<Post> lovedPosts; 
	public List<Post> wowPosts;
	public List<Post> hiddenPosts;
	public List<Post> sharedPosts; 
	public List<Post> savedPosts;	
	public List<Post> myMemories;
	public Date lastactiveTime;
	
	public List<Account> findPeople(String firstName)
	{
	   return null;
	}
	public void reportAnAccount(Account account, String reason)
	{
	}
	public void reacteToPost(Post post)
	{
		
	}
	public void denyFriendRequest(Account account)
	{
	   // logic to reject request goes here
	}
	public void acceptFriend(Account account)
	{
	   friends.add(account);
	}
	public void unFriend(Account account)
	{
	   friends.remove(account);
	}
}
class LoginPage extends FacebookBasePage {  }
class ProfilePage extends FacebookBasePage 
{ 
	
	// inner class - Wall Page is part of Profile
	class WallPage extends FacebookBasePage 
	{ 
		
	}
}
