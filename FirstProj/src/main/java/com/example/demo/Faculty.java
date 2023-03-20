package com.example.demo;

import org.springframework.stereotype.Component;

@Component("fac1")
public class Faculty {
	private int fid;
	private String fname;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + "]";
	}
	public void compile()
	{
		System.out.println("faculty compile");
	}
}
