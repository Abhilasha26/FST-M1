import pytest

# fixture for divisibility.py
@pytest.fixture
def numdata ():
    num=39
    return num


# fixture for Activity23.py
@pytest.fixture
def input_numbers():
    int_list=[0,1,2,3,4,5,6,7,8,9,10]

    return int_list