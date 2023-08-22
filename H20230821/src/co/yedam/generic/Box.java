package co.yedam.generic;
public class Box<T> {
	
// T : type parameter
// <T> 제네릭.
	T obj;
	
	T get() {
		return obj;
	}
	
	void set(T obj) {
		this.obj = obj;
	}
}
