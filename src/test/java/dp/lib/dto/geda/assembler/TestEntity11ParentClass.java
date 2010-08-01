
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package dp.lib.dto.geda.assembler;

import org.junit.Ignore;

/**
 * Test DTO for Assembler.
 *
 * @author Denis Pavlov
 * @since 1.0.0
 *
 */
@Ignore
public class TestEntity11ParentClass implements TestEntity11ParentInterface {
	
	private long entityId; // NOTE: this name is default mapping for @DtoParent#value if you have another name
	                       // then annotation must be specified.
	private String name;
	
	/**
	 * @return PK of this entity.
	 */
	public long getEntityId() {
		return entityId;
	}
	/**
	 * @param entityId PK of this entity.
	 */
	public void setEntityId(final long entityId) {
		this.entityId = entityId;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name name
	 */
	public void setName(final String name) {
		this.name = name;
	}
	
}
