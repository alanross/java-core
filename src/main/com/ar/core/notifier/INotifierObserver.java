package com.ar.core.notifier;

/**
 * @author Alan Ross
 * @version 0.1
 */
public interface INotifierObserver
{
	void onNotifierEvent( INotifierEvent event );
}

