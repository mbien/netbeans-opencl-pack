// created on ${date}

/**
 * @author ${user}
 */
kernel void fill(global int* a, const int size, const int value) {
    int index = get_global_id(0);
    if (index >= size) {
        return;
    }
    a[index] = 42;
}