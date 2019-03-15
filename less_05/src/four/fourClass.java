package four;

public class fourClass {
	int a;
	int b;
	int c;

	public fourClass(int i, int j) {
		this.a = i;
		this.b = j;
	}

	public fourClass(int i, int j, int k) {
		this(i, j);
		this.c = k;
	}
}
