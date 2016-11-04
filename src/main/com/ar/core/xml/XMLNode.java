package com.ar.core.xml;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

/**
 * @author Alan Ross
 * @version 0.1
 */
public final class XMLNode
{
	public String name = "";
	public String value = "";
	public XMLNode parent;
	public Hashtable<String, String> attributes;
	public LinkedList<XMLNode> children;

	public XMLNode()
	{
		this.children = new LinkedList<XMLNode>();
		this.attributes = new Hashtable<String, String>();
	}

	public XMLNode( String name )
	{
		this.children = new LinkedList<XMLNode>();
		this.attributes = new Hashtable<String, String>();
		this.name = name;
	}

	public Boolean hasAttribute( String id )
	{
		return ( this.attributes.get( id ) != null );
	}

	public String getAttribute( String id )
	{
		return ( this.attributes.get( id ) );
	}

	public String getAttributes()
	{
		StringBuilder atts = new StringBuilder();

		Enumeration<String> items = this.attributes.keys();

		while( items.hasMoreElements() )
		{
			String key = items.nextElement();

			atts.append( key );
			atts.append( "=" );
			atts.append( "\"" );
			atts.append( this.attributes.get( key ) );
			atts.append( "\"" );

			if( items.hasMoreElements() )
			{
				atts.append( " " );
			}
		}

		return atts.toString();
	}

	public XMLNode clone()
	{
		XMLNode node = new XMLNode( name );
		node.value = value;
		node.parent = parent;
		node.attributes = attributes;
		node.children = children;

		//node.attributes = ( Hashtable<String, String> ) this.attributes.clone();
		//node.children = ( ArrayList<XMLNode> ) this.children.clone();

		return node;
	}

	public int getNumChildren()
	{
		return children.size();
	}

	public XMLNode getChildAt( int index )
	{
		return children.get( index );
	}

	public Boolean isLeaf()
	{
		return ( children.size() == 0 );
	}

	public Boolean hasValue()
	{
		return ( value != null && value.length() > 0 );
	}

	@Override
	public String toString()
	{
		return "[XMLNode name=\"" + name + "\" value=\"" + value + "\" children=\"" + children.size() + "\" " + getAttributes() + "]";
	}
}