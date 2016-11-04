package com.ar.core.notifier;

import com.ar.core.utils.IDisposable;

/**
 * @author Alan Ross
 * @version 0.1
 */
public interface INotifierEvent extends IDisposable
{
	void reset();

	String toString();
}

