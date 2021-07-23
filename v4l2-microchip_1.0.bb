#
# Yocto recipe to build a kernel module out of the kernel tree
# kernmodule.bb  
# Marco Cavallini - KOAN sas - www.koansoftware.com
#

DESCRIPTION = "microchip v4l driver"
SECTION = "examples"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
PR = "r0"

inherit module

SRC_URI = 	"file://Makefile \
		file://v4l2-microchip.c \
		file://COPYING \
		"

S = "${WORKDIR}"

