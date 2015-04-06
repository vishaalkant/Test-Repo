package com.portware.internaltools.portwaretaskview.main;

import java.util.Set;

import com.portware.internaltools.portwaretaskview.data.PwTask;
import com.portware.internaltools.portwaretaskview.data.PwTaskStatus;
import com.portware.internaltools.portwaretaskview.data.PwUser;

/**
 * 
 * @author vishaal kant
 *
 */
public interface IPortwareTaskManager {
	public Set<PwTask> getTasks(String projectId) throws Exception;
	public Set<PwTask> getTasks(String projectId, PwUser user) throws Exception;
	public Set<PwTask> getTasks(String projectId, PwUser user, PwTaskStatus status) throws Exception;
}
