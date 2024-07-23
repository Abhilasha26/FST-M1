import pytest

@pytest.fixture
def input_value():
    num=40
    return num

def test_divisible_by_4(input_value):
    assert input_value % 4 == 0

def test_divisible_by_3(input_value):
    assert input_value % 3 == 0
