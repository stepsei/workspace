#!/usr/bin/env perl
#
# Copyright (C) 2009-2012, 2014, 2016  Internet Systems Consortium, Inc. ("ISC")
#
# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.

# $Id: bindkeys.pl,v 1.7 2011/01/04 23:47:13 tbox Exp $

use strict;
use warnings;

my $rev = '$Id: bindkeys.pl,v 1.7 2011/01/04 23:47:13 tbox Exp $';
$rev =~ s/\$//g;
$rev =~ s/,v//g;
$rev =~ s/Id: //;

my $keys = "";

my $lines;
while (<>) {
    chomp;
    if (/\/\* .Id:.* \*\//) {
	$keys = $_;
	next;
    }
    s/\"/\\\"/g;
    s/$/\\n\\/;
    $lines .= $_ . "\n";
}

$keys =~ s/\$//g;
$keys =~ s/\/\* Id: //;
$keys =~ s/\*\/.*//;
$keys =~ s/,v//;

print "/*\n * Generated by $rev \n * From $keys\n */\n";

my $mkey = '#define MANAGED_KEYS "\\' . "\n" . $lines . "\"\n";

$lines =~ s/managed-keys/trusted-keys/;
$lines =~ s/\s+initial-key//g;
my $tkey = '#define TRUSTED_KEYS "\\' . "\n" . $lines . "\"\n";

print $tkey;
print "\n";
print $mkey;
