import pytest

@pytest.fixture
def wallet_amount():
     amount=0
     return amount


@pytest.mark.parametrize("earned,spent,expected",  [(30,10,20),(20,2,18),])
def test_transaction(wallet_amount, earned,spent,expected):

    #add money 
    wallet_amount +=earned

   # subtract money
    wallet_amount -= spent

    #Assertion
    assert wallet_amount ==expected
    
  


