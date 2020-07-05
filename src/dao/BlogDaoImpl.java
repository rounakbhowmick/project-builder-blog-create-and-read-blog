package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Blog;
import utility.ConnectionManager;

public class BlogDaoImpl implements BlogDaoInterface {
	List<Blog> list = new ArrayList<Blog>();

	@Override
	public void insertBlog(Blog blog) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO blog(blogName,blogDescription,postedOn)VALUES(?,?,?,?)";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
		ps.setString(1, blog.getBlogTitle());
		ps.setString(2, blog.getBlogDescription());
//		ps.setDate(3, java.sql.Date.valueOf(blog.getPostedOn()));
		ps.setDate(3, blog.getPostedOn());
		ps.executeUpdate();
	}

	@Override
	public List<Blog> selectAllBlogs(Blog blog) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from blog";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Blog myblog = new Blog(rs.getString(1), rs.getString(2), rs.getDate(3));
			list.add(myblog);
		}
		return list;
	}

}