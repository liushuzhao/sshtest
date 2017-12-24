package com.mr.action;

import com.mr.dao.UserDAO;
import com.mr.user.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	UserDAO userDAO;
	User user;
	String repassword;

	public String add() {
		try {
			if (user != null) {

				userDAO.insert(user);// ִ���û���ӵķ���
				return "success";
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}

	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		if (user == null) {
			System.out.println("userΪ��");
		} else {
			if (user.getUsername() == null
					|| user.getUsername().trim().equals("")) {
				addFieldError("", "�û�������Ϊ��");
			}
			if (user.getPassword() == null
					|| user.getPassword().trim().equals("")) {
				addFieldError("", "���벻��Ϊ��");
			}
			if (user.getEmail() == null || user.getEmail().trim().equals("")) {
				addFieldError("", "���䲻��Ϊ��");
			}
			if (user.getPhone() == null || user.getPhone().trim().equals("")) {
				addFieldError("", "�绰����Ϊ��");
			}
			if (!user.getPassword().equals(repassword)) {
				addFieldError("", "�����������벻һ��");
			}
			String regex = "(13[0-9]|(15[012356789])|18[056789])[0-9]{8}";
			if (!user.getPhone().matches(regex)) {
				addFieldError("", "��������Ч�绰����");
			}
			regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
			if (!user.getEmail().matches(regex)) {
				addFieldError("", "�����ʽ����ȷ");
			}

		}
		super.validate();
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

}
