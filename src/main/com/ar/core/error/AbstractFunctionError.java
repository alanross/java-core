package com.ar.core.error;

import com.ar.core.utils.ArrayUtils;

/**
 * @author Alan Ross
 * @version 0.1
 */
@SuppressWarnings( "serial" )
public final class AbstractFunctionError extends Error
{
	public AbstractFunctionError( Object... params )
	{
		super( ArrayUtils.join( params, " " ) );

		System.out.println( "Throw error: " + this );
	}

	@Override
	public String toString()
	{
		return "[AbstractFunctionError message:" + getMessage() + "]";
	}
}

