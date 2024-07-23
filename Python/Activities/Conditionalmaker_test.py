import pytest

#--------subsets program
#Run tests based on substring-"function"
@pytest.mark.Test
@pytest.mark.skip #----provide conditional execution- it will be skipped----
#--Sum of two numbers
def test_add_function():
    num1 = 10
    num2 = 20
    sum = num1 + num2
    assert sum == 30

@pytest.mark.Test
@pytest.mark.xfail #-----this testcase is expected to be failed----
#--Difference of two numbers 
def test_subtract_function():
    x = 10
    y = 8
    diff = x - y
    assert diff == 3

#-----Apply the marker 'activity' to the last 2 test methods and Run tests based using the 'activity' marker.

@pytest.mark.activity
@pytest.mark.xPass      #-----this TC is expected to be passed------
#--Product of two numbers
def test_mult():
    n1 = 5
    n2 = 6
    multi= n1 * n2
    assert multi == 30

@pytest.mark.activity
@pytest.mark.skipif(condition=True, reason="Demo")
#--Quotient of two numbers
def test_divide():
    n1 = 30
    n2 = 5
    div = n1 / n2
    assert div == 6  