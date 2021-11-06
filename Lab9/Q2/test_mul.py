import mul

def test_calc_mul():
    output = mul.calc_mul(2,4)
    assert output == 8
    output = mul.calc_mul(4,4)
    assert output == 16
    output = mul.calc_mul(12,4)
    assert output == 48
    

    

    
