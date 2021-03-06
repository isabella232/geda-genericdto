
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.assembler.examples.simple;

import org.junit.Ignore;

/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.0.0
 *
 */
@Ignore
public class TestEntity10Class {
	
	private TestEntity10Interface nested;

	/**
	 * @return return entity as interface that further extends other interfaces
	 */
	public TestEntity10Interface getNested() {
		return nested;
	}
	/**
	 * @param nested return entity as interface that further extends other interfaces
	 */
	public void setNested(final TestEntity10Interface nested) {
		this.nested = nested;
	}
	
	

}
