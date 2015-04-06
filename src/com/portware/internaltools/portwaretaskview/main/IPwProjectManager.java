package com.portware.internaltools.portwaretaskview.main;

import java.util.Set;

import com.portware.internaltools.portwaretaskview.data.PwProject;

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
