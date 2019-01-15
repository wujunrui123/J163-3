package com.lovo.bean;


/**
 * 职位表
 * @author Administrator
 *
 */
public class RoleEntity {
    // Fields    
	/**
	 * 职位ID
	 */
     private int roleId;
     
     /**
      * 职位名称
      */
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