package com.volmit.iris.gen.nms.v16_2;

import com.volmit.iris.gen.atomics.AtomicCache;
import com.volmit.iris.gen.nms.INMSBinding;
import com.volmit.iris.gen.nms.INMSCreator;

public class NMSBinding16_2 implements INMSBinding
{
	private final AtomicCache<INMSCreator> creator = new AtomicCache<>();

	@Override
	public INMSCreator getCreator()
	{
		return creator.aquire(() -> new NMSCreator16_2());
	}
}
