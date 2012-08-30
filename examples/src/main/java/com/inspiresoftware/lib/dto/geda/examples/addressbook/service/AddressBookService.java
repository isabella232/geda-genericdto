/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package com.inspiresoftware.lib.dto.geda.examples.addressbook.service;

import com.inspiresoftware.lib.dto.geda.examples.addressbook.dto.ContactDTO;

import java.util.List;

/**
 * .
 * <p/>
 * User: denispavlov
 * Date: Aug 30, 2012
 * Time: 11:55:18 AM
 */
public interface AddressBookService {


    List<ContactDTO> getContactsByName(String firstName);

}
