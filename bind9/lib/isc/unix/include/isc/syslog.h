/*
 * Copyright (C) 1999-2001, 2004, 2005, 2007, 2016  Internet Systems Consortium, Inc. ("ISC")
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

/* $Id: syslog.h,v 1.7 2007/06/19 23:47:19 tbox Exp $ */

#ifndef ISC_SYSLOG_H
#define ISC_SYSLOG_H 1

/*! \file */

#include <isc/lang.h>
#include <isc/types.h>

ISC_LANG_BEGINDECLS

isc_result_t
isc_syslog_facilityfromstring(const char *str, int *facilityp);
/*%<
 * Convert 'str' to the appropriate syslog facility constant.
 *
 * Requires:
 *
 *\li	'str' is not NULL
 *\li	'facilityp' is not NULL
 *
 * Returns:
 * \li	#ISC_R_SUCCESS
 * \li	#ISC_R_NOTFOUND
 */

ISC_LANG_ENDDECLS

#endif /* ISC_SYSLOG_H */
