package com.app.criatosoft.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "userinfo")
@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long userid;
	
	@Column(name="firstname")
	private String first_name;
	
	
	@Column(name="lastname")
	private String last_name;
	
	//@Range(min = 1, max = 110)
	@Column(name="age")
	private Long age;
	
	@Column(name="email")
	private String email_id;
	
	@Column(name="pass_word")
	private String password;
}
