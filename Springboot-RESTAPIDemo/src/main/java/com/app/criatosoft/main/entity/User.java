package com.app.criatosoft.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Setter
@Getter
@Table(name = "user")
public class User {
	@Id
	@Column(name ="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	
	//user firstname not null or empty
	//atleast 2 characters
	
	@Column(name ="first_name")
	@NotBlank
	@Size(min = 2, message =  "atleast 2 characters required")
	private String firstname;
	
	//user lastname not null or empty
	//atleast 2 characters
	
	@Column(name ="last_name")
	@NotBlank
	@Size(min = 2, message =  "atleast 2 characters required")
	private String lastname;
	
	//atleast 6 numbers
	/*
	 * @Column(name ="pincode")
	 * 
	 * @NotBlank
	 * 
	 * @Size(max = 10) private String pincode;
	 */
	
	
	/*
	 * @Column(name ="date_of_birth")
	 * 
	 * @NotBlank private String dob;
	 */
	
	//email should have valid format
	//not empty
	@Column(name ="email_id")
	@NotBlank
	@Email
	private String email;
	
	//atleast 6 characters
	//notempty
	@Column(name ="password")
	@NotBlank
	@Size(min= 6, message = "atleast 6 characters")
	private String password;
	
	/*
	 * @Column(name ="joining_date")
	 * 
	 * @NotBlank private String join_date;
	 */
}
