package 第12章.第二题;

public interface SuperMapper<T, U> {
    U map(T val);
}
