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

import org.junit.Test;

/**
 * User: denispavlov
 * Date: 13-04-22
 * Time: 8:55 PM
 */
public class GenericsRunnerTest {

    @Test
    public void testGenericsMapping() throws Exception {

        new RunWithGenerics().genericMapping();

    }
}
