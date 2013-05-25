
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.performance;

/**
 * Interface to provide generic method to verify DTOs and Entities.
 * 
 * @author DPavlov
 */
public interface Verifiable {

	/**
	 * @param predicate validation source
	 * @return true if this object is valid against given predicate
	 */
	boolean isValid(final Object predicate);
	
}
