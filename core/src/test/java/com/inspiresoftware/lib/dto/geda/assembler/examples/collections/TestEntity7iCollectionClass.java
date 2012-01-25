
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package com.inspiresoftware.lib.dto.geda.assembler.examples.collections;

import org.junit.Ignore;

import com.inspiresoftware.lib.dto.geda.annotations.Dto;

import java.util.Collection;

/**
 * .
 * <p/>
 * User: Denis Pavlov
 * Date: Jan 26, 2010
 * Time: 11:41:47 AM
 */
@Dto
@Ignore
public class TestEntity7iCollectionClass implements TestEntity7CollectionInterface {

    private Collection<TestEntity7CollectionSubInterface> collection;

    /** {@inheritDoc} */
    public Collection<TestEntity7CollectionSubInterface> getCollection() {
        return collection;
    }

    /** {@inheritDoc} */
    public void setCollection(final Collection<TestEntity7CollectionSubInterface> collection) {
        this.collection = collection;
    }
}