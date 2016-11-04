package com.ar.core.error;

import com.ar.core.utils.ArrayUtils;

/**
 * @author Alan Ross
 * @version 0.1
 */
@SuppressWarnings( "serial" )
public final class MissingImplementationError extends Error
{
	public MissingImplementationError( Object... params )
	{
		super( ArrayUtils.join( params, " " ) );

		System.out.println( "Throw error: " + this );
	}

	@Override
	public String toString()
	{
		return "[MissingImplementationError message:" + getMessage() + "]";
	}
}

