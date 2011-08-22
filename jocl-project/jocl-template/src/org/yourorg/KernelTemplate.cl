// created on ${date}

/**
 * @author ${user}
 */
kernel void foo(global float* a, const int size) {
    int id = get_global_id(0);
    if (id >= size) {
        return;
    }
    a[id] = 0;
}