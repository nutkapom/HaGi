<?php
include "calculate.php";

class Test_calculate extends PHPUnit_Framework_TestCase{

    private $calculate;

    public function setup(){
      $this->calculate = new Calculate();
    }

    /**
    *@dataProvider additionProvider
    */
    public function testAdd($a, $b, $expected){
      $this->assertEquals($expected, $this->calculate->add($a, $b));
    }

    public function additionProvider()
    {
      return[
        '0+0=0' => [0,0,0],
        '0+1=1' => [0,1,1],
        '1+0=0' => [1,0,0],
        '1+3=3' => [1,4,3]
      ];

    }

}


 ?>
