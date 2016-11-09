# RocketMiles

Test Cases
======================
HelloChange!
Ready!
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
1
SHOW
$0:[ status>{20=0, 10=0, 5=0, 2=0, 1=0}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
2
PUT>>Enter denomination: #$20 #$10 #$5 #$2 #$1
0 1 0 1 1
$13:[ status>{20=0, 10=1, 5=0, 2=1, 1=1}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
4
CHANGE>>Enter the change:
8
Sorry! No Change...
$13:[ status>{20=0, 10=1, 5=0, 2=1, 1=1}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT

-------------------------------------------------------------------------------

HelloChange!
Ready!
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
1
SHOW
$0:[ status>{20=0, 10=0, 5=0, 2=0, 1=0}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
2
PUT>>Enter denomination: #$20 #$10 #$5 #$2 #$1
0 0 2 1 1
$13:[ status>{20=0, 10=0, 5=2, 2=1, 1=1}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
4
CHANGE>>Enter the change:
8
>>{20=0, 10=0, 5=1, 2=1, 1=1}
$5:[ status>{20=0, 10=0, 5=1, 2=0, 1=0}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
------------------------------------------------------------------------------------


HelloChange!
Ready!
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
1
SHOW
$0:[ status>{20=0, 10=0, 5=0, 2=0, 1=0}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
2
PUT>>Enter denomination: #$20 #$10 #$5 #$2 #$1
0 0 1 4 0
$13:[ status>{20=0, 10=0, 5=1, 2=4, 1=0}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT
4
CHANGE>>Enter the change:
8
>>{20=0, 10=0, 5=0, 2=4, 1=0}
$5:[ status>{20=0, 10=0, 5=1, 2=0, 1=0}]
1.SHOW  2.PUT 3.TAKE 4. CHANGE 5.EXIT

