package com.vishaal.internaltools.taskmanager.main;

import java.util.Set;

import com.vishaal.internaltools.taskmanager.data.PwTask;
import com.vishaal.internaltools.taskmanager.data.PwTaskStatus;
import com.vishaal.internaltools.taskmanager.data.PwUser;

/**
 * 
 * @author vishaal kant
 *
 */
public interface IPwTaskManager {
	public Set<PwTask> getTasks(String projectId) throws Exception;
	public Set<PwTask> getTasks(String projectId, PwUser user) throws Exception;
	public Set<PwTask> getTasks(String projectId, PwUser user, PwTaskStatus status) throws Exception;
}
