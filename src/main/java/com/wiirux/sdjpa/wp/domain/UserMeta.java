package com.wiirux.sdjpa.wp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "wp_usermeta")
public class UserMeta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "umeta_id")
	private Long id;
	private Long userId;
	private String metaKey;
	
	@Lob
	//@Column(name = "meta_value", columnDefinition = "LONGTEXT")
	@Column(name = "meta_value", columnDefinition = "LONGTEXT")
	private String metaValue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMetaKey() {
		return metaKey;
	}
	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}
	public String getMetaValue() {
		return metaValue;
	}
	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}
}