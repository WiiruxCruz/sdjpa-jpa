package com.wiirux.sdjpa.wp.domain;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(
	name = "wp_comments",
	indexes = {
		@Index(name = "comment_post_ID", columnList = "comment_post_ID"),
		@Index(name = "comment_approved_date_gmt", columnList = "comment_date_gmt, comment_approved"),
		@Index(name = "comment_date_gmt", columnList = "comment_date_gmt"),
		@Index(name = "comment_parent", columnList = "comment_parent"),
		@Index(name = "comment_author_email", columnList = "comment_author_email")
	}
)
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_ID")
	private Long id;
	
	@NotNull
	@Column(name = "comment_post_ID")
	private Long postId;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "comment_author", columnDefinition = "tinytext")
	private String author;
	
	@NotNull
	@Email
	@Size(max = 100)
	@Column(name = "comment_author_email", length = 100)
	private String authorEmail;
	
	@NotNull
	@Size(max = 100)
	@Column(name = "comment_author_IP", length = 100)
	private String authorIp;
	
	@NotNull
	@Column(name = "comment_date")
	private Timestamp commentDate;
	
	@NotNull
	@Column(name = "comment_date_gmt")
	private Timestamp commentDateGmt;
	
	@Lob
	@NotNull
	@Column(name = "comment_content", columnDefinition = "text")
	private String content;
	
	@NotNull
	@Column(name = "comment_karma")
	private Integer karma;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "comment_approved", length = 20)
	private String approved;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "comment_agent")
	private String agent;
	
	@NotNull
	@Size(max = 20)
	@Column(name = "comment_type", length = 20)
	private String commentType;
	
	@NotNull
	@Column(name = "comment_parent")
	private Long commentParent;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public String getAuthorIp() {
		return authorIp;
	}

	public void setAuthorIp(String authorIp) {
		this.authorIp = authorIp;
	}

	public Timestamp getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}

	public Timestamp getCommentDateGmt() {
		return commentDateGmt;
	}

	public void setCommentDateGmt(Timestamp commentDateGmt) {
		this.commentDateGmt = commentDateGmt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getKarma() {
		return karma;
	}

	public void setKarma(Integer karma) {
		this.karma = karma;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public String getAgent() {
		return agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public Long getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(Long commentParent) {
		this.commentParent = commentParent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
