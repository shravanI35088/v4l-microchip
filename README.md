# v4l-microchip

Example:

v4l20: v4l2microchip@0 {
	compatible = "microchip,v4l2_microchip";
	status = "okay";
	port {
		skel_0: endpoint {
			remote-endpoint = <&imx334_0>;
		};
	};

};

i2c0: i2c0@2010a000 {
       #address-cells = <1>;
       #size-cells = <0>;
       compatible = "microchip,mpfs-i2c";
       reg = <0x0 0x2010a000 0x0 0x1000>;
       interrupt-parent = <&L1>;
       interrupts = <58>;
       clock-frequency = <100000>;
       clocks = <&clkcfg CLK_I2C0>;
       status = "okay";

	imx334: camera@21 {
		compatible = "sony,imx334";
                enable-gpios = <&mssgpio 9 0>;
                reset-gpios = <&mssgpio 8 0>;
                trngrst-gpios = <&mssgpio 4 0>;
		reg = <0x1a>;
		status = "okay";
		port {
			imx334_0: endpoint {
				remote-endpoint = <&skel_0>;
			};
		};
	};
};

device tree ref:Documentation/devicetree/bindings/media/atmel-isc.txt
subdev_v4l ref:drivers/media/platform/atmel/atmel-sama5d2-isc.c
