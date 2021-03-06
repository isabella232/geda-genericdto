

/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.examples.usecases.generics;

import org.junit.Ignore;

/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.1.1
 * 
 * @param <V> simple value
 *
 */
@Ignore
public class EntityGenericItemClass<V> {

	private V myProp;
	
	/**
	 * @return property
	 */
	public V getMyProp() {
		return myProp;
	}

	/**
	 * @param myProp property
	 */
	public void setMyProp(final V myProp) {
		this.myProp = myProp;
	}
	
}
