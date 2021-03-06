
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */


package com.inspiresoftware.lib.dto.geda.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Provides a mapping between the target entity and the
 * {@link com.inspiresoftware.lib.dto.geda.annotations.Dto} annotated object.
 *
 * Defines a virtual field in a DTO. A virtual field does not exist on the entity
 * thus all logic for populating to/from the DTO's virtual field relies on the converter.
 *
 * @author Denis Pavlov
 * @since 1.1.3
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface DtoVirtualField {
	
	/**
	 * Textual reference to a converter to use when assembling DTO's and Entities. This reference is
     * used to lookup converter in adapters map passed into assembleDto and assembleEntity methods.
     * This converter must implement {@link com.inspiresoftware.lib.dto.geda.adapter.ValueConverter}.
     *
     * Requires adapters parameter during assembly.
	 *
	 * @return converter key
	 */
	String converter() default "";
	
	/**
	 * Marks Dto for read only state. When assembler assembles entity the data in Dto fields with
	 * readOnly set to true will be ignored.
	 *
	 * @return read only flag
	 */
	boolean readOnly() default false;

}
