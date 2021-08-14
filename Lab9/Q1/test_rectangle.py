import rectangle

def test_calc_area():
    output = rectangle.calc_area(2,4)
    assert output == 8
def test_calc_perimeter():
    output = rectangle.calc_perimeter(2, 4)
    assert output == 12
