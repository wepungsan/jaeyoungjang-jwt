package com.study.jwt.account.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
public class RefreshToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String refreshToken;
	@NotBlank
	private String accountEmail;

	public RefreshToken(String token, String email) {
		this.refreshToken = token;
		this.accountEmail = email;
	}

	public RefreshToken updateToken(String token) {
		this.refreshToken = token;
		return this;
	}

}
