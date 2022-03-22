package com.aspire.project.facebook;

import java.util.List;

public abstract class Post {
	private Post parentPost;
	public abstract boolean createPost();
	public abstract boolean deletePost();
	public abstract boolean hidePost();	
	public abstract boolean editTextPost();
	public abstract boolean addCommentPost(Post parentPost,String newComment,Account commentingUser);
	public abstract List<Post> searchPost(String searchCriteria);
}
class ImagePost extends Post
{

	@Override
	public boolean createPost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hidePost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editTextPost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCommentPost(Post parentPost, String newComment, Account commentingUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Post> searchPost(String searchCriteria) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class VideoPost extends Post
{

	@Override
	public boolean createPost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hidePost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editTextPost() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCommentPost(Post parentPost, String newComment, Account commentingUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Post> searchPost(String searchCriteria) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
/* media
	
	
	CommentText
	GIF
	emojis
	stickers
	Map
	blogs
	
*/