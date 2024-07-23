import pytest

def test_sum(input_numbers):
    sum=0

    for n in input_numbers:
        sum+=n

    assert sum==55
