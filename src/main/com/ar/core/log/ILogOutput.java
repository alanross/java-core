package com.ar.core.log;


import com.ar.core.utils.IDisposable;

/**
 * (output)Used medium for log messages.
 *
 * @author Alan Ross
 * @version 0.1
 */
public interface ILogOutput extends IDisposable
{
	/**
	 * Called when message is written to log
	 */
	void write( Level level, ContextInfo context, String message );
}

