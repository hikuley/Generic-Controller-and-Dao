package com.ibrahimkuley.util.genericDao;

import java.io.Serializable;


/**
 * Created by hikuley on 25.05.2015.
 */

public class BaseEntity implements Serializable
{

	private Long id;

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}
}
