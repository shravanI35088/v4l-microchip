# SPDX-License-Identifier: GPL-2.0
ccflags-y += -I$(SRC)/ -DWILC_ASIC_A0 -DWILC_DEBUGFS

obj-m += v4l2-microchip.o

SRC := $(shell pwd)

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) modules_install

clean:
	$(MAKE) -C $(KERNEL_SRC) M=$(SRC) clean

