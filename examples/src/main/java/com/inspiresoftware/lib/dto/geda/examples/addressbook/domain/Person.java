/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.genericdtoassembler.org
 * SVN: https://svn.code.sf.net/p/geda-genericdto/code/trunk/
 * SVN (mirror): http://geda-genericdto.googlecode.com/svn/trunk/
 */

package com.inspiresoftware.lib.dto.geda.examples.addressbook.domain;

/**
 * .
 *
 * User: denispavlov
 * Date: Aug 30, 2012
 * Time: 11:46:43 AM
 */
public interface Person {

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

}
