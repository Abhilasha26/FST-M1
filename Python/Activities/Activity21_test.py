import pytest

#--Sum of two numbers
def test_add():
    num1 = 10
    num2 = 20
    sum = num1 + num2
    assert sum == 30

#--Difference of two numbers
def test_subtract():
    x = 10
    y = 8
    diff = x - y
    assert diff == 3

#--Product of two numbers
def test_mult():
    n1 = 5
    n2 = 6
    multi= n1 * n2
    assert multi == 30

#--Quotient of two numbers
def test_divide():
    n1 = 30
    n2 = 5
    div = n1 / n2
    assert div == 6  