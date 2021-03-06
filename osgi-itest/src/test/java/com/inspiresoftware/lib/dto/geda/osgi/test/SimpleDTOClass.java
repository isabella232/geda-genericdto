/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.osgi.test;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;
import com.inspiresoftware.lib.dto.geda.annotations.DtoField;

import java.math.BigDecimal;

/**
 * User: denispavlov
 * Date: 13-02-20
 * Time: 10:54 AM
 */
@Dto
public class SimpleDTOClass implements SimpleDTO {

    @DtoField
    private String string;
    @DtoField
    private BigDecimal decimal;
    @DtoField
    private int integer;

    public String getString() {
        return string;
    }

    public void setString(final String string) {
        this.string = string;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(final BigDecimal decimal) {
        this.decimal = decimal;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(final int integer) {
        this.integer = integer;
    }
}
