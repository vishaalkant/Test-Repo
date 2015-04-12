package com.vishaal.internaltools.taskmanager.main;

import java.util.Set;

import com.vishaal.internaltools.taskmanager.data.PwProject;

/**
 * 
 * @author vishaalkant
 *
 */
public interface IPwProjectManager {
	public Set<PwProject> getAllProjects() throws Exception;
	public PwProject getProject(String description) throws Exception;
	public PwProject getProjectFromID(String ID) throws Exception;
}
