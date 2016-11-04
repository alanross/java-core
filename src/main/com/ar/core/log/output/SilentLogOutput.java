package com.ar.core.log.output;

import com.ar.core.log.ContextInfo;
import com.ar.core.log.ILogOutput;
import com.ar.core.log.Level;
import com.ar.core.utils.ArrayUtils;

import java.util.LinkedList;

/**
 * @author Alan Ross
 * @version 0.1
 */
public final class SilentLogOutput implements ILogOutput
{
	private LinkedList<String> _record;

	public SilentLogOutput()
	{
		_record = new LinkedList<String>();
	}

	@Override
	public void write( Level level, ContextInfo context, String message )
	{
		_record.addLast( ( "[" + level.getName().toUpperCase() + " :: " + context.getName().toUpperCase() + "]: " + message ) );
	}

	public String dump( String separator/* = "\n" */ )
	{
		return ArrayUtils.join( _record, separator );
	}

	@Override
	public void dispose()
	{
		_record = null;
	}

	@Override
	public String toString()
	{
		return "[SilentLogOutput]";
	}
}