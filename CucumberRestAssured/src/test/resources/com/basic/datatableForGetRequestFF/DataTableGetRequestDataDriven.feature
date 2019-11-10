Feature: First GET with Driven Rest Assured test106


Scenario: Test my Get Method106
Given  user start the rest asured test
When user hit the get request
Then user validate following in json
	| MRData.limit																|  30			            |
	| MRData.CircuitTable.Circuits[0].circuitId 	|  albert_park	      |
	| MRData.CircuitTable.Circuits[10].circuitId	|	 red_bull_ring			|


#when we have similar type of data in bulk we need to use datatable.datatable written by cucumber