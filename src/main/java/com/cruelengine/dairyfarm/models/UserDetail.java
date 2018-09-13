package com.cruelengine.dairyfarm.models;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.cruelengine.dairyfarm.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @ToString @Data
public class UserDetail implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6236751927848823695L;
	
	@Id
	private String id;
	
	private String username;
	private String password;
	
	
	@Getter @Setter
	private Boolean enabled;
	

	private List<AccountType> accountType;
	
	public UserDetail(String username) {
		this.username = username;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.accountType.stream().map(authority -> new SimpleGrantedAuthority(authority.name())).collect(Collectors.toList());
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
	
	public List<AccountType> getAccountType(){
		return accountType;
	}
	
	public void setAccountType(List<AccountType> accountType) {
		this.accountType = accountType;
	}
}
