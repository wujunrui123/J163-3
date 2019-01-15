package com.lovo.bean;



public class RoleEntity {
    // Fields    
     private int roleId;
     private String roleName;





    public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "RoleEntity [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

	public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


   








}