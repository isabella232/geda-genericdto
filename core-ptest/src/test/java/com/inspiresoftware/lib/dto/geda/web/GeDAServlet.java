
/*
 * This code is distributed under The GNU Lesser General Public License (LGPLv3)
 * Please visit GNU site for LGPLv3 http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright Denis Pavlov 2009
 * Web: http://www.inspire-software.com
 * SVN: https://geda-genericdto.svn.sourceforge.net/svnroot/geda-genericdto
 */

package com.inspiresoftware.lib.dto.geda.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inspiresoftware.lib.dto.geda.performance.PerformanceTestLevel3Thread;
import com.inspiresoftware.lib.dto.geda.performance.ShutdownListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Basic servlet to test how GeDA works under servlet container in real-time.
 * 
 * @author denispavlov
 *
 */
public class GeDAServlet extends HttpServlet {

	private static final long serialVersionUID = 20110401L;
	
	private final ShutdownListener listener = new ShutdownListener() {

		/** {@inheritDoc} */
		public void addObservable(final Object object) {
			// nothing
		}

		/** {@inheritDoc} */
		public void notifyFinished(final Object object) {
			// do nothing
		}
		
	};

	/** {@inheritDoc} */
	@Override
	protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
			throws ServletException, IOException {
		
		final PerformanceTestLevel3Thread task = new PerformanceTestLevel3Thread(2000, listener);
		task.run(); // just do it in this request.
		resp.getOutputStream().print(task.toString());
		
	}
	
}
