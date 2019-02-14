package com.luckyframe.project.system.roleProject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.luckyframe.project.system.roleProject.mapper.RoleProjectMapper;
import com.luckyframe.project.system.roleProject.domain.RoleProject;
import com.luckyframe.project.system.roleProject.service.IRoleProjectService;
import com.luckyframe.common.support.Convert;

/**
 * 角色和项目关联 服务层实现
 * 
 * @author luckyframe
 * @date 2019-02-13
 */
@Service
public class RoleProjectServiceImpl implements IRoleProjectService 
{
	@Autowired
	private RoleProjectMapper roleProjectMapper;

	/**
     * 查询角色和项目关联信息
     * 
     * @param roleId 角色和项目关联ID
     * @return 角色和项目关联信息
     */
    @Override
	public RoleProject selectRoleProjectById(Integer roleId)
	{
	    return roleProjectMapper.selectRoleProjectById(roleId);
	}
	
	/**
     * 查询角色和项目关联列表
     * 
     * @param roleProject 角色和项目关联信息
     * @return 角色和项目关联集合
     */
	@Override
	public List<RoleProject> selectRoleProjectList(RoleProject roleProject)
	{
	    return roleProjectMapper.selectRoleProjectList(roleProject);
	}
	
    /**
     * 新增角色和项目关联
     * 
     * @param roleProject 角色和项目关联信息
     * @return 结果
     */
	@Override
	public int insertRoleProject(RoleProject roleProject)
	{
	    return roleProjectMapper.insertRoleProject(roleProject);
	}
	
	/**
     * 修改角色和项目关联
     * 
     * @param roleProject 角色和项目关联信息
     * @return 结果
     */
	@Override
	public int updateRoleProject(RoleProject roleProject)
	{
	    return roleProjectMapper.updateRoleProject(roleProject);
	}

	/**
     * 删除角色和项目关联对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteRoleProjectByIds(String ids)
	{
		return roleProjectMapper.deleteRoleProjectByIds(Convert.toStrArray(ids));
	}
	
}
