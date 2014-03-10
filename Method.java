public class Method {

	double geta(double x) {

		return x * x;

	}

	double getb(double x) {
		return Math.sin(x);
	}

	double getc(double x) {
		return Math.cos(x);
	}

	double getd(double x) {
		return Math.tan(x);
	}

	double gete(double x) {
		return Math.cos(x) + 5 * Math.sin(x);
	}

	double getf(double x) {
		return 5 * Math.cos(x) + Math.sin(x);
	}

	double getg(double x) {
		return Math.log(x) / Math.log(10) + x * x;
	}
}
