package com.ar.core.log.output;

import com.ar.core.log.ContextInfo;
import com.ar.core.log.ILogOutput;
import com.ar.core.log.Level;

/**
 * @author Alan Ross
 * @version 0.1
 */
public final class SimpleLogOutput implements ILogOutput
{
	public SimpleLogOutput()
	{
	}

	@Override
	public void write( Level level, ContextInfo context, String message )
	{
		//DateUtils.getTimeStamp() + " [" + context.getName().toUpperCase() + "]: " + message;

		System.out.println( "[" + level.getName().toUpperCase() + " :: " + context.getName().toUpperCase() + "]: " + message );
	}

	@Override
	public void dispose()
	{
	}

	@Override
	public String toString()
	{
		return "[SimpleLogOutput]";
	}
}