long rfun (unsigned long x)
{
    if (x == 0)
        return (0);
    unsigned long nx = x >> 2;
    long rv = rfun(nx);
    return (x + rv);
}

int main()
{
    rfun(10);
    return (0);
}