package tw.org.iii;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public interface GenericT06interface<T> {
	void save(T t );
	void update(T t );
}
