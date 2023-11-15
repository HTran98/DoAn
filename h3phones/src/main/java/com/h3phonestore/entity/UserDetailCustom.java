package com.h3phonestore.entity;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UserDetailCustom implements UserDetails {

	private static final long serialVersionUID = 1L;
	private User user;

	public Collection<? extends GrantedAuthority> getAuthorities() {

		return Collections.singleton(new SimpleGrantedAuthority(user.getRoleInfo().getRoleName()));
	}

	public String getPassword() {

		return user.getPassWords();
	}

	public String getUsername() {

		return user.getUserName();
	}

	public boolean isAccountNonExpired() {

		return true;
	}

	public boolean isAccountNonLocked() {

		return true;
	}

	public boolean isCredentialsNonExpired() {

		return true;
	}

	public boolean isEnabled() {

		return true;
	}

	public UserDetailCustom(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
