package com.codemind.clgTpo.student.model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;

import com.codemind.clgTpo.model.Role;

@Entity
@Table (name = "student", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Student {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String firstName;
	    private String lastName;
	    private Integer rollNo;
	    private Date dateOfBirth;
	    private Integer year;
	    private String branch;
	    private Long mobileNumber;
	    private String email;
	    private Float tenthPer;
	    private Float twelthPer;
	    private Float deplomaPer;
	    private Float degreePer;
	    private String degreeDiploma;
	    private String password;
	    
	    @Lob
	    private byte[] resume;

		/*
		 * @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
		 * 
		 * @JoinTable( name = "users_roles", joinColumns = @JoinColumn( name =
		 * "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(
		 * name = "role_id", referencedColumnName = "id")) private Collection< Role >
		 * roles;
		 */

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Integer getRollNo() {
			return rollNo;
		}

		public void setRollNo(Integer rollNo) {
			this.rollNo = rollNo;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public Long getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(Long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Float getTenthPer() {
			return tenthPer;
		}

		public void setTenthPer(Float tenthPer) {
			this.tenthPer = tenthPer;
		}

		public Float getTwelthPer() {
			return twelthPer;
		}

		public void setTwelthPer(Float twelthPer) {
			this.twelthPer = twelthPer;
		}

		public Float getDeplomaPer() {
			return deplomaPer;
		}

		public void setDeplomaPer(Float deplomaPer) {
			this.deplomaPer = deplomaPer;
		}

		public Float getDegreePer() {
			return degreePer;
		}

		public void setDegreePer(Float degreePer) {
			this.degreePer = degreePer;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public byte[] getResume() {
			return resume;
		}

		public void setResume(byte[] resume) {
			this.resume = resume;
		}
		/*
		 * public Collection<Role> getRoles() { return roles; }
		 * 
		 * public void setRoles(Collection<Role> roles) { this.roles = roles; }
		 */

		public String getDegreeDiploma() {
			return degreeDiploma;
		}

		public void setDegreeDiploma(String degreeDiploma) {
			this.degreeDiploma = degreeDiploma;
		}


		

}
